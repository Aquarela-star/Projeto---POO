package com.magalu.ecommerce.venda.pagamento;

public class Credito extends Pagamento {
    public Credito(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + calcularValorFinal() + " processado no Crédito.");
    }
}