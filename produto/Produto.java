package produto;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
    
    @Override
    public String toString() {
        return String.format("%s - R$ %.2f x %d = R$ %.2f", 
            nome, preco, quantidade, preco * quantidade);
    }
}
