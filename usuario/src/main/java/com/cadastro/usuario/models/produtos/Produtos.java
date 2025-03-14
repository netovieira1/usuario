package com.cadastro.usuario.models.produtos;

import com.cadastro.usuario.models.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_produtos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private  String preco;

    private Usuario usuario;

}
