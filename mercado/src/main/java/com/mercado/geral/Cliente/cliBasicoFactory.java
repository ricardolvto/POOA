package com.mercado.geral.Cliente;


public class cliBasicoFactory implements ClientFactory {

    @Override
    public Cliente criaCliente(){
        Basico cliBasico = new Basico();
        return cliBasico;
    }
}
