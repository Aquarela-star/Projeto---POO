package Pagamentos;

public class CartaoCredito extends Pagamento {
    public CartaoCredito(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + calcularValorFinal() + " processado no Crédito.");
    }
}