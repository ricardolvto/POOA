package model.cliente;

class Basic extends Cliente{
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
