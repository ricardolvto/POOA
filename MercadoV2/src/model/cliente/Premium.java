package model.cliente;

class Premium extends Cliente implements  IPremium {
    private double desconto = 0.10;
    private double mensalidade = 59.9;
    private boolean status;
    
    @Override
    public double getDesconto() {
        return desconto;
    }
    @Override
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    @Override
    public double getMensalidade() {
        return mensalidade;
    }
    @Override
    public  void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void tipoCliente()
    {
        System.out.println("cliente_premium");
    }

    @Override
    public void setMensalidadePaga(boolean mensalidadePaga)
    {
        this.status = mensalidadePaga;
    }

    @Override
    public boolean getMensalidadePaga()
    {
        return this.status;
    }
}


