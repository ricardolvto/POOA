package model.cliente;

import java.util.Vector;

import model.compra.CarrinhoOnline;

public interface iCliente {

    public String getNome();

    public void setNome(String nome);

    public String getCpf();

    public void setCpf(String cpf);

    public Vector<Cartao> getCartaoList();

    public void setCartaoList(Vector<Cartao> lista);

    public void addCartao(Cartao cartao);

    public void tipoCliente();

    public void removeCartao(Cartao cartao);

    public Cartao getCartao(String numero_cart);

    public CarrinhoOnline getCarrinho();

}
