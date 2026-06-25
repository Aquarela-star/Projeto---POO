package cadastro;

public class Juridica extends Cliente {

    private int cnpj;

    public Juridica(int id, String nome, String email, int cnpj) {
        super(id, nome, email);
        this.cnpj = cnpj;
    }

    public Juridica(int id, String nome, String email) {
        super(id, nome, email);
        this.cnpj = 0;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return "CNPJ: " + this.cnpj;
    }

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
