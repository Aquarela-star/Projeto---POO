package com.magalu.ecommerce.venda.entrega;

public class Loja extends Entrega {

    @Override
    public String calcularPrazo(){
        
        return "Produto pronto para retirada na loja";
    }
}
