
import atendimento.AtendenteVirtual;
import cadastro.Cliente;
import cadastro.Fisica;
import cadastro.Juridica;
import entrega.Entrega;
import pagamento.Pagamento;
import pedido.NotaFiscal;
import pedido.Pedido;
import produto.Produto;
import entrega.Rapida;
import entrega.Loja;
import entrega.Padrao;
import pagamento.Pix;
import pagamento.Boleto;
import pagamento.Credito;
import pagamento.Debito;

public class Main {

public static void main(String[] args) {

    System.out.println("====================================");
    System.out.println("      SISTEMA E-COMMERCE");
    System.out.println("====================================\n");


    
    //Criação dos Clientes//
    Cliente clientePF = new Fisica(
            1,
            "Gustavo Alves",
            "gustavo@email.com",
            123456789
    );

    Cliente clientePJ = new Juridica(
            2,
            "Loja Tecnologia LTDA",
            "contato@loja.com",
            987654321
    );

    clientePF.criarConta();
    clientePF.registrarEndereco("Rua A, 100");

    System.out.println();

    clientePJ.criarConta();
    clientePJ.registrarEndereco("Av. Central, 500");

    System.out.println("\n====================================\n");



    //Contato com a atendente virtual// 
    AtendenteVirtual bot = new AtendenteVirtual("MagaluBot");

    clientePF.falarComAtendente(bot);
    System.err.println("---------------------------------------");
    clientePJ.falarComAtendente(bot);

    System.out.println("\n====================================\n");



    // Produtos e Entregas// 
    Produto notebook = new Produto(
            "Notebook Gamer",
            5500,
            1,
            new Rapida()
    );

    Produto celular = new Produto(
            "Celular Samsung",
            2500,
            1,
            new Padrao()
    );

    Produto impressora = new Produto(
            "Impressora",
            900,
            1,
            new Loja()
    );

    notebook.exibirProduto();
    System.out.println();

    celular.exibirProduto();
    System.out.println();

    impressora.exibirProduto();

    System.out.println("\n====================================\n");



    //Primeiro exemplo de pedido da pessoa fisica//
    Pedido pedido1 = new Pedido(
            1001,
            clientePF.getNome()
    );

    clientePF.adicionarProduto();
    pedido1.adicionarProduto(notebook);

    clientePF.adicionarProduto();
    pedido1.adicionarProduto(celular);

    clientePF.adicionarPedido(pedido1);

    pedido1.exibirPedido();

    System.out.println("\nPagamento via PIX");

    Pagamento pix = new Pix(pedido1.getTotalPedido());

    clientePF.registrarPagamento();
    pix.realizarPagamento();

    NotaFiscal nf1 = pedido1.gerarNF();

    System.out.println();
    nf1.imprimirNota();

    System.out.println("\n====================================\n");


    
    //Comprando a impressora//
    Pedido pedido2 = new Pedido(
            1002,
            clientePF.getNome()
    );

    clientePF.adicionarProduto();
    pedido2.adicionarProduto(impressora);

    clientePF.adicionarPedido(pedido2);

    pedido2.exibirPedido();

    System.out.println("\nPagamento via Crédito");

    Pagamento credito = new Credito(
            pedido2.getTotalPedido()
    );

    clientePF.registrarPagamento();
    credito.realizarPagamento();

    NotaFiscal nf2 = pedido2.gerarNF();

    System.out.println();
    nf2.imprimirNota();

    System.out.println("\n====================================\n");

    

    //Exemplo de pedido da empresa//
    Pedido pedido3 = new Pedido(
            2001,
            clientePJ.getNome()
    );

    pedido3.adicionarProduto(notebook);
    pedido3.adicionarProduto(impressora);

    clientePJ.adicionarPedido(pedido3);

    pedido3.exibirPedido();

    System.out.println("\nPagamento via Boleto");

    Pagamento boleto = new Boleto(
            pedido3.getTotalPedido()
    );

    clientePJ.registrarPagamento();
    boleto.realizarPagamento();

    NotaFiscal nf3 = pedido3.gerarNF();

    System.out.println();
    nf3.imprimirNota();

    System.out.println("\n====================================\n");

}

}
