package com.mercado.geral.Cliente;

import java.util.Vector;

public abstract class Cliente {

    private String nome;
    private String cpf;
    private Vector<Cartao> CartaoList;

    public Cliente() {
        this.nome = "joao";
        this.cpf = "cpf";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Vector<Cartao> getCartaoList() {
        return CartaoList;
    }
    public void setCartaoList(Vector<Cartao> cartaoList) {
        CartaoList = cartaoList;
    }

}
