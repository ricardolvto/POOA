package com.mercado.geral.Cliente;

class Cartao {
    private String numero_cart;
    private String nome;
    private String cod_seguranca;

    
    public String getNumero_cart() {
        return numero_cart;
    }
    public void setNumero_cart(String numero_cart) {
        this.numero_cart = numero_cart;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCod_seguranca() {
        return cod_seguranca;
    }
    public void setCod_seguranca(String cod_seguranca) {
        this.cod_seguranca = cod_seguranca;
    }
}
