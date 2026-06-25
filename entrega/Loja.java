package entrega;

public class Loja extends Entrega {

    @Override
    public String calcularPrazo(){
        
        return "Produto pronto para retirada na loja";
    }
}
