    package com.example.demo.Models;

    import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.JoinColumn;
    import jakarta.persistence.ManyToOne;
    import jakarta.persistence.Table;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    @Entity
    @Getter
    @Setter
    @Table(name = "funcionario_por_cargo")
    @AllArgsConstructor
    @NoArgsConstructor
    public class FuncCargosModels {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;

        @ManyToOne
        @JoinColumn(name = "funcionarioModels",referencedColumnName = "id", nullable = false)
        private FuncionarioModels funcionario;

        @ManyToOne
        @JoinColumn(name = "cargo",referencedColumnName = "id", nullable = false)
        private CargosModels cargo;

        @Column(name = "data_inicio", nullable = false)
        private LocalDate data_inicio;
    }