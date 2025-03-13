package com.cadastro.usuario.models;


public class UsuarioModel {

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
