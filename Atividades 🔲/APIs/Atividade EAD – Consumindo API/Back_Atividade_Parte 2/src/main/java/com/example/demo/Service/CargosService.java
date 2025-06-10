package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.CargosModels;
import com.example.demo.Repository.CargosRepository;

@SpringBootApplication
public class CargosService {


    @Autowired
    private CargosRepository repository;

    public List<CargosModels> listarTodos(){
        return repository.findAll();
    }

    public Optional<CargosModels> buscarPorId(long id){
        return repository.findById(id);

    }

    public CargosModels criar(CargosModels cargosModels){
        return repository.save(cargosModels);
    }
    
    public CargosModels atualizar(long id, CargosModels cargosModels){
        return repository.save(cargosModels);
    }
    

    public void deletar(long id){
        repository.deleteById(id);


}
}