import cliente.*;

public class TesteCliente {
    public static void main(String[] args) {
        // Teste de pessoa fisica
        PessoaFisica pf = new PessoaFisica(1, "Gustavo Candido", "gustavo@email.com", 123456789);
        pf.criarConta();
        pf.registrarEndereco("Rua das Flores, 123 - Patos de Minas/MG");
        System.out.println("------------------------------");

        // Teste de pessoa juridica
        PessoaJuridica pj = new PessoaJuridica(2, "Loja Exemplo LTDA", "contato@loja.com", 12345678);
        pj.criarConta();
        pj.registrarEndereco("Av. Central, 456 - Patos de Minas/MG");
        System.out.println("------------------------------");

        //Polimorfismo
        Cliente[] clientes = { pf, pj };
        for (Cliente c : clientes) {
            System.out.println(c.getNome() + " -> " + c.getDocumento());
        }
    }
}
