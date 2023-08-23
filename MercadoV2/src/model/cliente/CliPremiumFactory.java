package model.cliente;

public class CliPremiumFactory extends CliFactory{

    @Override
    public Premium criaCliente() {
        return new Premium();
    }

    
    public IPremium criaCliente(IBasic cliente)
    {
        Premium cliente_novo = new Premium();
        cliente_novo.setCpf(cliente.getCpf());
        cliente_novo.setNome(cliente.getNome());
        cliente_novo.setCartaoList(cliente.getCartaoList());
        return cliente_novo;
    }

    
}
