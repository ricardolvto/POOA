package model.cliente ;

import java.util.Vector;

public abstract class Cliente implements ICliente{

    private String nome;
    private String cpf;
    private Vector<Cartao> CartaoList;


    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public Vector<Cartao> getCartaoList() {
        return CartaoList;
    }
    @Override
    public void setCartaoList(Vector<Cartao> cartaoList) {
        CartaoList = cartaoList;
    }

    @Override
    public void tipoCliente()
    {
        System.out.println("cliente_generico");
    }

    

}
