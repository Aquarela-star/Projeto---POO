package com.magalu.ecommerce.venda.atendimento;

import java.util.ArrayList;
import com.magalu.ecommerce.venda.cadastro.Cliente;

public class AtendenteVirtual {

    private ArrayList<Cliente> clientes;
    private String nome;

    public AtendenteVirtual(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " adicionado ao atendente " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
