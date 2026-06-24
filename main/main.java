package main;
import produto.produto;
import entrega.entrega;
import entrega.entregaPadrao;
import entrega.entregaRapida;
import entrega.retiradaLoja;

public class main {
    public static void main(String[] args) {
        entrega padrao = new entregaPadrao();
        entrega rapida = new entregaRapida();
        entrega loja = new retiradaLoja();

        produto produto1 = new produto("Telefone", 1500.00, loja);
        produto produto2 = new produto("Notebook", 5500.00, rapida);
        produto produto3 = new produto("Kit panela", 600.00, padrao);

        produto1.exibirProduto();
        System.out.println("-----------------------------------------------------------------");

        produto2.exibirProduto();
        System.out.println("-----------------------------------------------------------------");

        produto3.exibirProduto();
        
    }
}

