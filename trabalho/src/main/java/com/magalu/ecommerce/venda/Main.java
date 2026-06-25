package com.magalu.ecommerce.venda;

import java.util.ArrayList;

import com.magalu.ecommerce.venda.pagamento.Boleto;
import com.magalu.ecommerce.venda.pagamento.Credito;
import com.magalu.ecommerce.venda.pagamento.Debito;
import com.magalu.ecommerce.venda.pagamento.Pagamento;
import com.magalu.ecommerce.venda.pagamento.Pix;
import com.magalu.ecommerce.venda.produto.Produto;
import com.magalu.ecommerce.venda.cadastro.Cliente;
import com.magalu.ecommerce.venda.cadastro.Juridica;
import com.magalu.ecommerce.venda.entrega.*;
import com.magalu.ecommerce.venda.cadastro.*;

public class Main {
    public static void main(String[] args) {

        double valorCompra = 1000.00;

        ArrayList<Pagamento> listaDeTestes = new ArrayList<>();

        listaDeTestes.add(new Boleto(valorCompra));
        listaDeTestes.add(new Credito(valorCompra));
        listaDeTestes.add(new Debito(valorCompra));
        listaDeTestes.add(new Pix(valorCompra));

        System.out.println("======= SIMULAÇÃO DE PAGAMENTOS =======");
        System.out.println("Valor base da compra: R$ " + valorCompra);
        System.out.println("=======================================");

        for (Pagamento p : listaDeTestes) {
            p.realizarPagamento();
            System.out.println("---------------------------------------");
        }

        Entrega padrao = new Padrao();
        Entrega rapida = new Rapida();
        Entrega loja = new Loja();

        Produto produto1 = new Produto("Telefone", 1500.00, 1, loja);
        Produto produto2 = new Produto("Notebook", 5500.00, 1, rapida);
        Produto produto3 = new Produto("Kit panela", 600.00, 1, padrao);

        produto1.exibirProduto();
        System.out.println("---------------------------------------");

        produto2.exibirProduto();
        System.out.println("---------------------------------------");

        produto3.exibirProduto();

        Fisica pf = new Fisica(1, "Gustavo Candido", "gustavo@email.com", 123456789);
        pf.criarConta();
        pf.registrarEndereco("Rua A, 123 - Patos de Minas/MG");
        System.out.println("------------------------------");

        Juridica pj = new Juridica(2, "Loja Exemplo LTDA", "contato@loja.com", 12345678);
        pj.criarConta();
        pj.registrarEndereco("Rua B, 456 - Patos de Minas/MG");
        System.out.println("------------------------------");

        Cliente[] clientes = { pf, pj };
        for (Cliente c : clientes) {
            System.out.println(c.getNome() + " -> " + c.getDocumento());
        }
    }
}