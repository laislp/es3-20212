package com.company;

public class Produto {
    private String nome;
    private Double preco;
    private Loja loja;

    public Produto(String nome, Double preco, Loja loja) {
        this.nome = nome;
        this.preco = preco;
        this.loja = loja;
    }
}
