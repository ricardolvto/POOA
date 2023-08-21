package model.cliente;

class Premium extends Cliente implements IPremium {
    private float desconto;
    private float mensalidade;
    
    @Override
    public float getDesconto() {
        return desconto;
    }
    @Override
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    @Override
    public float getMensalidade() {
        return mensalidade;
    }
    @Override
    public  void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void tipoCliente()
    {
        System.out.println("cliente_premium");
    }
}


