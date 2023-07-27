package com.mercado.geral.Compra;

import java.util.Vector;

import com.mercado.geral.Cliente.Cliente;

public class carrinhoOnline {
    private Cliente cliente;
    private Vector<itensCompra> listaCarrinho;


    public boolean encerrar_venda()
    {
        return true;
    }

    public boolean comecar_venda(Vector<itensCompra> listaVenda)
    {
        return true;
    }


    public Vector<itensCompra> getListaCarrinho() {
        return listaCarrinho;
    }



    public void setListaCarrinho(Vector<itensCompra> listaCarrinho) {
        this.listaCarrinho = listaCarrinho;
    }
    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
