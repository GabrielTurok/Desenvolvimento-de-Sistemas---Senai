package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.FuncCargosModels;
import com.example.demo.Repository.FuncCargosRepository;

@SpringBootApplication
public class FuncCargosService {


    @Autowired
    private FuncCargosRepository repository;

    public List<FuncCargosModels> listarTodos(){
        return repository.findAll();
    }

    public Optional<FuncCargosModels> buscarPorId(long id){
        return repository.findById(id);

    }

    public FuncCargosModels criar(FuncCargosModels funcCargosModels){
        return repository.save(funcCargosModels);
    }
    
    public FuncCargosModels atualizar(long id, FuncCargosModels funcCargosModels){
        return repository.save(funcCargosModels);
    }
    

    public void deletar(long id){
        repository.deleteById(id);


}
}