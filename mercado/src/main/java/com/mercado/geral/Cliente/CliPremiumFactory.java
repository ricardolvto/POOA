package com.mercado.geral.Cliente;

public class CliPremiumFactory implements ClientFactory  {

    @Override
    public Cliente criaCliente(){
        Premium cliPremium = new Premium();
        return cliPremium;
    }
    
}
