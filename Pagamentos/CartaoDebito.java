package Pagamentos;

public class CartaoDebito extends Pagamento {
    public CartaoDebito(double valorOriginal) {
        super(valorOriginal);
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento de R$" + calcularValorFinal() + " processado no Debito.");
    }
}