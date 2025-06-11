package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.FuncionarioModels;
import com.example.demo.Repository.FuncionarioRepository;

@SpringBootApplication
public class FuncionarioService {


    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioModels> listarTodos(){
        return repository.findAll();
    }

    public Optional<FuncionarioModels> buscarPorId(long id){
        return repository.findById(id);

    }

    public FuncionarioModels criar(FuncionarioModels funcionarioModels){
        return repository.save(funcionarioModels);
    }
    
    public FuncionarioModels atualizar(long id, FuncionarioModels funcionarioModels){
        return repository.save(funcionarioModels);
    }
    

    public void deletar(long id){
        repository.deleteById(id);


}
}