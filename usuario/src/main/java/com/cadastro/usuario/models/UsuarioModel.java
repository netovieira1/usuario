package com.cadastro.usuario.models;

import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;

    String email;

    String senha;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
