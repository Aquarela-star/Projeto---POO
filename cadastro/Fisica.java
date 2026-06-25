package cadastro;

public class Fisica extends Cliente {

    private int cpf;

    public Fisica(int id, String nome, String email, int cpf) {
        super(id, nome, email);
        this.cpf = cpf;
    }

    public Fisica(int id, String nome, String email) {
        super(id, nome, email);
        this.cpf = 0;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return "CPF: " + this.cpf;
    }

    @Override
    public void criarConta() {
        super.criarConta();
        System.out.println("Tipo: Pessoa Física | " + getDocumento());
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
