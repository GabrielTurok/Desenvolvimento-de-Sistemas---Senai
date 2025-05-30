package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Models.AlunoModels;
import com.example.Repository.AlunosRepository;

@SpringBootApplication
public class AlunosService {


    @Autowired
    private AlunosRepository repository;

    public List<AlunoModels> listarTodos(){
        return repository.findAll();
    }

    public Optional<AlunoModels> buscarPorId(long id){
        return repository.findById(id);

    }

    public AlunoModels criar(AlunoModels alunoModels){
        return repository.save(alunoModels);
    }
    
    public AlunoModels atualizar(long id, AlunoModels alunoModels){
        return repository.save(alunoModels);
    }
    

    public void deletar(long id){
        repository.deleteById(id);


}
}