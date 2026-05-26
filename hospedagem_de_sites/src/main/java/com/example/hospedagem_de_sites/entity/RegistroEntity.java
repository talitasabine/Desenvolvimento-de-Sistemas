package com.example.hospedagem_de_sites.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tbl_registro")
public class RegistroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioEntity usuario;

    @Column(nullable = false)
    private LocalDate dataRegistro;

    @Column(nullable = false, length = 50)
    private String status;

    @PrePersist
    public void prePersist() {
        this.dataRegistro = LocalDate.now();
    }
}