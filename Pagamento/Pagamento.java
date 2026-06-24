public abstract class Pagamento {
    protected double valorOriginal;

    public Pagamento(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public double calcularValorFinal() {
        return valorOriginal;
    }

    public abstract void realizarPagamento();
}