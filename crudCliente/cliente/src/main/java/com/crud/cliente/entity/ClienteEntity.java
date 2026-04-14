package com.crud.cliente.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
//Gera automaticamente
// get () set () toString() equals() hashCode()

@Entity
//Indica que essa classe representa uma tabela no banco de dados

@Table(name = "tbl_cliente")
//Define o nome da tabela no banco
public class ClienteEntity {

    @Id
    //Define que esse campo é a chave primária PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Define autoincremento (o banco gera ID automaticamente)
    private Long id;

    @Column(nullable = false)
    //campo obrigatório (nao pode ser nulo ou branco)
    private String nome;

    private String sobrenome;
    //campo opcional (pode ser nulo)

    @Column(unique = true, nullable = false)
    //campo obrigatório e único (não pode repetir mas pode ser nulo)
    private String cpf;

    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    //campo simps (mapeados automaticamente como colunas)

    private LocalDateTime dataCadastro;
    //campo para armazenar data e hora do cadastro

    @PrePersist
    //método executado automaticamente ANTES de salvar no banco
    public void PrePersist() {
            this.dataCadastro = LocalDateTime.now();
            //preenche automaticamente com data/hora atual
    }
}
