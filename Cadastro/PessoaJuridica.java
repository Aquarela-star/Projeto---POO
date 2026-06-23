package cliente;

public class PessoaJuridica extends Cliente {

    private int cnpj;

    // Construtor básico
    public PessoaJuridica(int id, String nome, String email, int cnpj) {
        super(id, nome, email);
        this.cnpj = cnpj;
    }

    // Sobrecarga de construtor: PessoaJuridica sem cnpj definido ainda
    public PessoaJuridica(int id, String nome, String email) {
        super(id, nome, email);
        this.cnpj = 0;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    // Sobrescrita do método abstrato da superclasse
    @Override
    public String getDocumento() {
        return "CNPJ: " + this.cnpj;
    }

    // Sobrescrita do criarConta (chama o pai e complementa)
    @Override
    public void criarConta() {
        super.criarConta();
        System.out.println("Tipo: Pessoa Jurídica | " + getDocumento());
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + getNome() + '\'' +
                ", cnpj=" + cnpj +
                '}';
    }
}
