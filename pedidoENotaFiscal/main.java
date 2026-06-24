import pedido.Pedido;
import pedido.Produto;
import notafiscal.NotaFiscal;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1001, "João Silva");
        
        // Adicionando produtos
        pedido.adicionarProduto(new Produto("Notebook", 3500.00, 1));
        pedido.adicionarProduto(new Produto("Mouse", 150.00, 2));
        pedido.adicionarProduto(new Produto("Teclado", 200.00, 1));
        pedido.adicionarProduto(new Produto("Monitor", 1200.00, 1));
        
        pedido.exibirPedido();
        
        NotaFiscal notaFiscal = pedido.gerarNF();
        
        notaFiscal.imprimirNota();
        
        System.out.println("\n=== TESTE DE VALIDAÇÃO ===");
        Pedido pedido2 = new Pedido(1002, "Maria Santos");
        pedido2.adicionarProduto(new Produto("Produto Inválido", 0.00, 0));
        pedido2.adicionarProduto(new Produto("Caderno", 25.00, 3));
        pedido2.exibirPedido();
        
        NotaFiscal notaFiscal2 = pedido2.gerarNF();
        notaFiscal2.imprimirNota();
    }
}