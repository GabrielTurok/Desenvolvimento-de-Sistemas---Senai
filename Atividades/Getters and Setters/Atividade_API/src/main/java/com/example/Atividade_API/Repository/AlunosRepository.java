package com.example.Atividade_API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Atividade_API.Model.AlunosModel;

public interface AlunosRepository extends JpaRepository<AlunosModel, Long> {
}