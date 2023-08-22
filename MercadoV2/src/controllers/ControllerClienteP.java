package controllers;

import model.cliente.CliPremiumFactory;
import model.cliente.IPremium;
import model.cliente.iCliente;

public class ControllerClienteP extends ControllerCliente{

    @Override
    public IPremium CriaCliente() {
        CliPremiumFactory factory = new CliPremiumFactory();
        return factory.criaCliente();
    }

    
     
}
