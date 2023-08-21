package model.cliente;

public class CliBasicoFactory extends CliFactory {

    @Override
    public Basic criaCliente() {
        return new Basic();
    }
    
}
