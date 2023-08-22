package model.cliente ;

import java.util.Vector;

public abstract class Cliente implements iCliente{

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
    public void addCartao(Cartao cartao) {
        this.CartaoList.addElement(cartao);
    }

    @Override
    public void removeCartao(int numero_cart) {
        this.CartaoList.remove(numero_cart);
    }


    @Override
    public int getCartao(String numero_cart)
    {
        return CartaoList.indexOf(numero_cart);
    }

    @Override
    public void tipoCliente()
    {
        System.out.println("cliente_generico");
    }

    @Override
    public void setCartaoList(Vector<Cartao> lista)
    {
        this.CartaoList = lista;
    }
    

}
