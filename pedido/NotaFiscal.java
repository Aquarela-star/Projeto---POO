package pedido;

import produto.Produto;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class NotaFiscal {

    private int numeroPedido;
    private String cliente;
    private List<Produto> produtos;
    private double total;
    private LocalDateTime dataEmissao;
    private String codigoNota;
    
    public NotaFiscal(int numeroPedido, String cliente, List<Produto> produtos, double total) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.produtos = produtos;
        this.total = total;
        this.dataEmissao = LocalDateTime.now();
        this.codigoNota = gerarCodigoNota();
    }
    
    private String gerarCodigoNota() {
        return "NF-" + System.currentTimeMillis() + "-" + numeroPedido;
    }

    public void imprimirNota() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        System.out.println("\n=== NOTA FISCAL ===");
        System.out.println("Código: " + codigoNota);
        System.out.println("Data Emissão: " + dataEmissao.format(formatter));
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("------------------------");
        System.out.println("ITENS:");
        for (Produto produto : produtos) {
            System.out.printf("  %s - R$ %.2f x %d = R$ %.2f\n",
                produto.getNome(),
                produto.getPreco(),
                produto.getQuantidade(),
                produto.getPreco() * produto.getQuantidade());
        }
        System.out.println("------------------------");
        System.out.printf("TOTAL: R$ %.2f\n", total);
        System.out.println("========================");
    }
    
    public int getNumeroPedido() {
        return numeroPedido;
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public double getTotal() {
        return total;
    }
    
    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }
    
    public String getCodigoNota() {
        return codigoNota;
    }
}
