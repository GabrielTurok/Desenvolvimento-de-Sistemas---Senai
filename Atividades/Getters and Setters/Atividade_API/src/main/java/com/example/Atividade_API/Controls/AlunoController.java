package com.example.Atividade_API.Controls;

import com.example.Atividade_API.Model.Aluno;
import com.example.Atividade_API.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    // Get all alunos
    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    // Get aluno by ID
    @GetMapping("/{id}")
    public Optional<Aluno> getAlunoById(@PathVariable Long id) {
        return alunoRepository.findById(id);
    }

    // Create a new aluno
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Update an existing aluno
    @PutMapping("/{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno alunoDetails) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        if (alunoOptional.isPresent()) {
            Aluno aluno = alunoOptional.get();
            aluno.setNome(alunoDetails.getNome());
            aluno.setEmail(alunoDetails.getEmail());
            return alunoRepository.save(aluno);
        }
        return null;
    }

    // Delete aluno
    @DeleteMapping("/{id}")
    public void deleteAluno(@PathVariable Long id) {
        alunoRepository.deleteById(id);
    }
}
