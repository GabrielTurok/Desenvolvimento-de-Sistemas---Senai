package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Models.AlunoModels;

@Repository
public interface AlunosRepository extends JpaRepository<AlunoModels, Long> {

}