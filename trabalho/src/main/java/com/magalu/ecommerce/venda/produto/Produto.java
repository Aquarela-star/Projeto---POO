package com.magalu.ecommerce.venda.produto;

import com.magalu.ecommerce.venda.entrega.Entrega;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    private Entrega entrega;
    
    public Produto(String nome, double preco, int quantidade, Entrega entrega) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.entrega = entrega;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo de entrega: " + entrega.getClass().getSimpleName());
        System.out.println("Prazo: "+ entrega.calcularPrazo());
    }
    
    @Override
    public String toString() {
        return String.format("%s - R$ %.2f x %d = R$ %.2f", 
            nome, preco, quantidade, preco * quantidade, entrega);
    }
}
