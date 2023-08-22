package model.cliente;

public class CliBasicoFactory extends CliFactory {

    @Override
    public Basic criaCliente() {
        return new Basic();
    }
    
    public Basic criaCliente(IPremium cliente)
    {
        Basic cliente_novo = new Basic();
        cliente_novo.setCpf(cliente.getCpf());
        cliente_novo.setNome(cliente.getNome());
        cliente_novo.setCartaoList(cliente.getCartaoList());
        return cliente_novo;
    }
}
