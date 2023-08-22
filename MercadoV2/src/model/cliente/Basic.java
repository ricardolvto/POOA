package model.cliente;

class Basic extends Cliente implements IBasic{
    private int pontos;
 
    public Basic() {
        this.pontos = 0;
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public void tipoCliente()
    {
        System.out.println("cliente_basico");
    }
}
