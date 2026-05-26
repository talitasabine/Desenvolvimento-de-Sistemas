package com.example.hospedagem_de_sites.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tbl_principal")
public class PrincipalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idde;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 255)
    private String descricao;

    @Column(nullable = false)
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersist() {
        this.dataCadastro = LocalDate.now();
    }
}