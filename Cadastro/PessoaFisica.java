package cliente;

public class PessoaFisica extends Cliente {

    private int cpf;

    // Construtor básico
    public PessoaFisica(int id, String nome, String email, int cpf) {
        super(id, nome, email);
        this.cpf = cpf;
    }

    // Sobrecarga de construtor: PessoaFisica sem cpf definido ainda
    public PessoaFisica(int id, String nome, String email) {
        super(id, nome, email);
        this.cpf = 0;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    // Sobrescrita do método abstrato da superclasse
    @Override
    public String getDocumento() {
        return "CPF: " + this.cpf;
    }

    // Sobrescrita do criarConta (chama o pai e complementa)
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
