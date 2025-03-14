package com.cadastro.usuario.controllers.produtos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProdutosController {

    @GetMapping("/produtos")
    public String produto(){
        return "Produtos";
    }
}
