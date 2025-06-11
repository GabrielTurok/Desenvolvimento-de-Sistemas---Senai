package com.example.demo.Controls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.ImagemModel;
import com.example.demo.Service.ImagemService;

@RestController
@RequestMapping("/api/bancoimagens")
public class ImagemController {

    @Autowired
    private ImagemService service;

    @GetMapping
    public List<ImagemModel> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImagemModel> buscarPorId(@PathVariable long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ImagemModel criarImagem(@RequestBody ImagemModel imgModels) {
        return service.criar(imgModels);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable long id) {
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ImagemModel> atualizar(@PathVariable long id, @RequestBody ImagemModel imgModels) {
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        imgModels.setId(id);
        return ResponseEntity.ok(service.atualizar(id, imgModels));
    }
}
