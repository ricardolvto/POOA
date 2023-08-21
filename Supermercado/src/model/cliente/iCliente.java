package model.cliente;

import java.util.Vector;

public interface ICliente {

    public String getNome();

    public void setNome(String nome);

    public String getCpf();

    public void setCpf(String cpf);

    public Vector<Cartao> getCartaoList();

    public void setCartaoList(Vector<Cartao> cartaoList);

    public void tipoCliente();
    
}
