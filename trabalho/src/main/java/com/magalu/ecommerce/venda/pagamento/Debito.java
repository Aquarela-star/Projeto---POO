package com.magalu.ecommerce.venda.pagamento;

public class Debito extends Pagamento {
    public Debito(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + calcularValorFinal() + " processado no Debito.");
    }
}