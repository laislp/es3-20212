package com.company;
import java.time.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente implements Comparable<Cliente> { // adidcionando comparable class
    private String Nome;
    private String Telefone;
    private Date DataNascimento;
    private Character Genero;
    private ArrayList<Produto> produto;

    public void setGenero(Character genero) {
        Genero = genero;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }


    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public Date getDataNascimento() {
        return this.DataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {

        this.DataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);;
    }

    public Character getGenero() {
        return Genero;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Cliente(String nome, String telefone, String dataNascimento, char genero) {
        Nome = nome;
        Telefone = telefone;
        this.DataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        Genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: "+this.getNome()+", Telefone: "+this.getTelefone()+", DataNascimento: "
                +this.getDataNascimento().toString()+", Genero: "+this.getGenero();
    }

    @Override
    public int compareTo(Cliente o) { return this.getNome().compareTo(o.getNome()); };
}
