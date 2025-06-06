package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "imagens")
@AllArgsConstructor
@NoArgsConstructor
public class ImagemModel {

    @Id
    @Column(name = "id_imagem")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome_imagem", nullable = false)
    private String nome;

    @Column(name = "url_imagem", nullable = false)
    private String url;
}
