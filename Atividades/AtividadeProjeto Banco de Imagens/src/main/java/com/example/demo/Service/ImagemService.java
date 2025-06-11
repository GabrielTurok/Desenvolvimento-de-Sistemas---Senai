package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.ImagemModel;
import com.example.demo.Repository.ImagemRepository;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository repository;

    public List<ImagemModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<ImagemModel> buscarPorId(long id) {
        return repository.findById(id);
    }

    public ImagemModel criar(ImagemModel imgModels) {
        return repository.save(imgModels);
    }

    public ImagemModel atualizar(long id, ImagemModel imgModels) {
        return repository.save(imgModels);
    }

    public void deletar(long id) {
        repository.deleteById(id);
    }
}
