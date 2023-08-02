package model.cliente;


public class cliBasicoFactory implements ClientFactory {

    @Override
    public Cliente criaCliente(){
        Basico cliBasico = new Basico();
        return cliBasico;
    }
}

public interface ClientFactory {
    
    public Cliente criaCliente();

}

public class CliPremiumFactory implements ClientFactory  {

    @Override
    public Cliente criaCliente(){
        Premium cliPremium = new Premium();
        return cliPremium;
    }
    
}
