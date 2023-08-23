package controllers;

import model.cliente.*;

public class ControllerClienteB extends ControllerCliente {

    @Override
    public IBasic CriaCliente() {
        CliBasicoFactory factory = new CliBasicoFactory();
        return factory.criaCliente();
    }


    public IPremium AssinarPlano(IBasic cliente)
    {
        CliPremiumFactory factory = new CliPremiumFactory();
        IPremium cliPremium = factory.criaCliente(cliente);
        return cliPremium;
    }

    

}
