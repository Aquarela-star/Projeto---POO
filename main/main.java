import br.unipam.ecommerce.pagamentos.*;
import java.util.ArrayList;

public class TestePagamentoMain {
    public static void main(String[] args) {
        // Valor base para o teste
        double valorCompra = 1000.00;

        // Criamos uma lista de Pagamentos para demonstrar o POLIMORFISMO
        // O Requisito 2 pede o uso de ArrayLists no projeto
        ArrayList<Pagamento> listaDeTestes = new ArrayList<>();
        
        // Adicionando as formas exigidas no Requisito 7
        listaDeTestes.add(new Boleto(valorCompra));
        listaDeTestes.add(new CartaoCredito(valorCompra));
        listaDeTestes.add(new CartaoDebito(valorCompra));
        listaDeTestes.add(new Pix(valorCompra)); // Deve aplicar o Requisito 8 (15% desconto)

        System.out.println("======= SIMULAÇÃO DE PAGAMENTOS =======");
        System.out.println("Valor base da compra: R$ " + valorCompra);
        System.out.println("=======================================");

        // Loop para processar cada pagamento
        for (Pagamento p : listaDeTestes) {
            // Demonstração de Polimorfismo e Sobrescrita:
            // Cada objeto chamará sua própria versão do método realizarPagamento()
            p.realizarPagamento();
            System.out.println("---------------------------------------");
        }
    }
}