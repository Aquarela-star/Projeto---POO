package com.magalu.ecommerce.venda.pagamento;

public class Boleto extends Pagamento {
    public Boleto(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + calcularValorFinal() + " processado no Boleto.");
    }
}