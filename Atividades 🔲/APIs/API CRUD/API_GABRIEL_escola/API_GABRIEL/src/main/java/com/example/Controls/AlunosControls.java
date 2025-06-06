package com.example.Controls;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.AlunoModels;
import com.example.Service.AlunosService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/alunos")
public class AlunosControls {

    @Autowired
    private AlunosService service;

    @GetMapping
    public List<AlunoModels> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModels> buscarPorId(@PathVariable long id) {
        return service.buscarPorId(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AlunoModels criarAlunosModels(@RequestBody AlunoModels alunosModels) {
        return service.criar(alunosModels);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable long id){
        if (!service.buscarPorId(id).isPresent()){
            return ResponseEntity.notFound().build();
        } else {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<AlunoModels> atualizar(@PathVariable long id, @RequestBody AlunoModels alunosModels) {
        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        alunosModels.setId(id);
        return ResponseEntity.ok(service.atualizar(id, alunosModels));
    }
    
    
}