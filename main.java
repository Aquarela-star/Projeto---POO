import Pagamento;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        double valorCompra = 1000.00;

        ArrayList<Pagamento> listaDeTestes = new ArrayList<>();

        listaDeTestes.add(new Boleto(valorCompra));
        listaDeTestes.add(new CartaoCredito(valorCompra));
        listaDeTestes.add(new CartaoDebito(valorCompra));
        listaDeTestes.add(new Pix(valorCompra));

        System.out.println("======= SIMULAÇÃO DE PAGAMENTOS =======");
        System.out.println("Valor base da compra: R$ " + valorCompra);
        System.out.println("=======================================");

        for (Pagamento p : listaDeTestes) {
            p.realizarPagamento();
            System.out.println("---------------------------------------");
        }
    }
}