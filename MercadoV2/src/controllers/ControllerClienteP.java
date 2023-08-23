package controllers;

import model.cliente.CliBasicoFactory;
import model.cliente.CliPremiumFactory;
import model.cliente.IBasic;
import model.cliente.IPremium;

public class ControllerClienteP extends ControllerCliente{

    @Override
    public IPremium CriaCliente() {
        CliPremiumFactory factory = new CliPremiumFactory();
        return factory.criaCliente();
    }


    
    public void PagarMensalidade(IPremium cliente)
    {
        cliente.setMensalidadePaga(true);
    }

    public IBasic cancelarMensalidade(IPremium cliente)
    {
        CliBasicoFactory factory = new CliBasicoFactory();
        IBasic cliPremium = factory.criaCliente(cliente);
        return cliPremium;
    }
     
}
