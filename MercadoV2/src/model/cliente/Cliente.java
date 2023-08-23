package model.cliente;

import java.util.Iterator;
import java.util.Vector;

import model.compra.CarrinhoOnline;

public abstract class Cliente implements iCliente {

    private String nome;
    private String cpf;
    private Vector<Cartao> CartaoList;
    private CarrinhoOnline carrinho;

    @Override
    public CarrinhoOnline getCarrinho() {
        return carrinho;
    }

    public Cliente() {
        this.carrinho = new CarrinhoOnline(this);
    }

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
    public void removeCartao(Cartao cartao) {
        this.CartaoList.removeElement(cartao);
    }

    @Override
    public Cartao getCartao(String numero_cart) {
        Iterator<Cartao> itr = CartaoList.iterator();
        while (itr.hasNext()) {
            if (itr.next().getNumero_cart() == numero_cart) {
                return itr.next();
            }
        }
        return null;
    }

    @Override
    public void tipoCliente() {
        System.out.println("cliente_generico");
    }

    @Override
    public void setCartaoList(Vector<Cartao> lista) {
        this.CartaoList = lista;
    }

}
