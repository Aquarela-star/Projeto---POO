package cliente;

import java.util.ArrayList;

public class AtendenteVirtual {

    private String nome;
    private ArrayList<Cliente> clientes;

    public AtendenteVirtual(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void atender(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Atendente " + nome + " está atendendo " + cliente.getNome());
    }
}
