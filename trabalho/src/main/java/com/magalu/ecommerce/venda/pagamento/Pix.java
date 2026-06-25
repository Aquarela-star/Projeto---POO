package com.magalu.ecommerce.venda.pagamento;

public class Pix extends Pagamento {

    public Pix(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public double calcularValorFinal() {
        
        return valorOriginal * 0.85;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado via PIX.");
        System.out.println("Valor original: R$" + valorOriginal);
        System.out.println("Valor com 15% de desconto: R$" + calcularValorFinal());
    }
}