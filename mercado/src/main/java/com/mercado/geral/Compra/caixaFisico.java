package com.mercado.geral.Compra;

public class caixaFisico {
    private boolean aberto;
    private float balanco;
    private int nun_caixa;


    public boolean cadastrar_entrada()
    {
        return true;
    }

    public boolean cadastrar_saida()
    {
        return true;
    }

    public boolean comecar_venda()
    {
        return true;
    }

    public boolean add_iten()
    {
        return true;
    }

    public boolean cancel_iten()
    {
        return true;
    }

    public boolean terminar_venda()
    {
        return true;
    }
    


    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public float getBalanco() {
        return balanco;
    }
    public void setBalanco(float balanco) {
        this.balanco = balanco;
    }
    public int getNun_caixa() {
        return nun_caixa;
    }
    public void setNun_caixa(int nun_caixa) {
        this.nun_caixa = nun_caixa;
    }

}
