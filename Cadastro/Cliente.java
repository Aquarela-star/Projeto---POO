package cliente;

import java.util.ArrayList;

public abstract class Cliente {

    private String nome;
    private String endereco;
    private String email;
    private int id;
    private AtendenteVirtual atendenteVirtual;
    private ArrayList<Pedido> pedido;

    // Construtor
    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pedido = new ArrayList<>();
    }

    /**
     * Cria a conta do cliente, exibindo uma confirmação simples.
     */
    public void criarConta() {
        System.out.println("Conta criada com sucesso!");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }

    /**
     * Registra o endereço do cliente.
     */
    public void registrarEndereco(String endereco) {
        this.endereco = endereco;
        System.out.println("Endereço registrado: " + this.endereco);
    }

    public void registrarPagamento() {
        // Implementado de acordo com a integração do grupo com Pagamento
        System.out.println("Forma de pagamento registrada.");
    }

    public void adicionarProduto() {
        // Implementado de acordo com a integração do grupo com Pedido/Produto
        System.out.println("Produto adicionado ao carrinho.");
    }

    public void falarComAtendente(AtendenteVirtual atendente) {
        this.atendenteVirtual = atendente;
        System.out.println(this.nome + " está em contato com o atendente " + atendente.getNome());
    }

    // ===== Getters e Setters =====

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AtendenteVirtual getAtendenteVirtual() {
        return atendenteVirtual;
    }

    public void setAtendenteVirtual(AtendenteVirtual atendenteVirtual) {
        this.atendenteVirtual = atendenteVirtual;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    public void adicionarPedido(Pedido p) {
        this.pedido.add(p);
    }

    /**
     * Método abstrato — cada subclasse (PessoaFisica/PessoaJuridica)
     * deve dizer como se identifica (cpf ou cnpj). Polimorfismo.
     */
    public abstract String getDocumento();

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
