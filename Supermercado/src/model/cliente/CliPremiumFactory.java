package model.cliente;

public class CliPremiumFactory extends CliFactory{

    @Override
    public Premium criaCliente() {
        return new Premium();
    }

    
}
