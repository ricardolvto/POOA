package com.mercado.geral.Cliente;

class Basico extends Cliente implements Basico_interface {
    private int pontos;
 
    

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
}
