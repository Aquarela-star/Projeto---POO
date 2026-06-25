package com.magalu.ecommerce.venda.entrega;

public class Rapida extends Entrega {

    @Override
    public String calcularPrazo(){
        
        return "Na entrega rapida o prazo e de 2 dias";
    }
}
