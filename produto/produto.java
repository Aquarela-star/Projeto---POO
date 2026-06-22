package produto;
import entrega.entrega;


public class produto {
    
    private String nomeProduto;
    private double precoProduto;
    private entrega entrega;

    public produto(String nomeProduto, double precoProduto, entrega entrega){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.entrega = entrega;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + precoProduto);
        System.out.println("Tipo de entrega: " + entrega.getClass().getSimpleName());
        System.out.println("Prazo: "+ entrega.calcularPrazo());   
    }
}
