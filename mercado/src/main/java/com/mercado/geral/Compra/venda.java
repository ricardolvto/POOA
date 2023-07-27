package com.mercado.geral.Compra;

import java.util.Vector;

public class venda {
    private Vector<itensCompra> itens_venda;
    private float valorVenda;
    private int status;

    public String nota_toString()
    {
        return "nota";
    }

    public void salvar_nota()
    {

    }

    public void atualizar_estoque()
    {

    }

    public void atualizar_balanco()
    {
        
    }

    public Vector<itensCompra> getItens_venda() {
        return itens_venda;
    }
    public void setItens_venda(Vector<itensCompra> itens_venda) {
        this.itens_venda = itens_venda;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }




}
