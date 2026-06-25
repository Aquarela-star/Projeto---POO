package com.magalu.ecommerce.venda.pedido;

import com.magalu.ecommerce.venda.produto.Produto;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private List<Produto> produtos;
    private double totalPedido;
    
    public Pedido(int numeroPedido, String cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.totalPedido = 0.0;
    }
    
    public void adicionarProduto(Produto produto) {
        if (produto != null && produto.getQuantidade() > 0) {
            produtos.add(produto);
            calcularTotalPedido();
        } else {
            System.out.println("Produto inválido ou quantidade zerada!");
        }
    }
    
    public void calcularTotalPedido() {
        totalPedido = 0.0;
        for (Produto produto : produtos) {
            totalPedido += produto.getPreco() * produto.getQuantidade();
        }
    }
    
    public NotaFiscal gerarNF() {
        NotaFiscal notaFiscal = new NotaFiscal(
            this.numeroPedido,
            this.cliente,
            this.produtos,
            this.totalPedido
        );
        return notaFiscal;
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }
    
    public double getTotalPedido() {
        return totalPedido;
    }

    public void exibirPedido() {
        System.out.println("=== PEDIDO ===");
        System.out.println("Número: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("  - " + produto);
        }
        System.out.printf("Total: R$ %.2f\n", totalPedido);
    }
}