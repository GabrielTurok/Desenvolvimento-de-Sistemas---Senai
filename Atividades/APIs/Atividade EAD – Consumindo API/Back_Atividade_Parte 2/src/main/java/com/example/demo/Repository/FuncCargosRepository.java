package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Models.FuncCargosModels;

@Repository
public interface FuncCargosRepository extends JpaRepository<FuncCargosModels, Long> {

}