package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    public Agenda(String nomeLoja) {
        loja = new Loja(nomeLoja);
        clientes = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    private ArrayList<Cliente> clientes;
    private Loja loja;

    public void AdicionarCliente(Cliente cli) {
        System.out.println("adicionando usuario "+ cli);
        clientes.add(cli);
    }
    public void ExcluirTodosClientes() {
        System.out.println("excluindo todos os usuarios");
        clientes.clear();
    }
    public void ListarClientes() {
        clientes.sort((c1,c2) -> c1.getNome().compareTo(c2.getNome()));
        System.out.println(this.clientes);
    }
    public void ListarPorGenero(Character genero) {
        ArrayList<Cliente> aux = new ArrayList<>();
        for (Cliente c: clientes) {
            if (c.getGenero().equals(genero)) {
                aux.add(c);
            }
        }
        System.out.println(aux);
    }
}
