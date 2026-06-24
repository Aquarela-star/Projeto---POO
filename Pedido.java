public class Pedido {
    private Pagamento formaPagamento;

    public void definirPagamento(Pagamento pagamento) {
        this.formaPagamento = pagamento;
    }

    public void finalizarPedido() {
        if (formaPagamento != null) {
            formaPagamento.realizarPagamento();
        }
    }
}