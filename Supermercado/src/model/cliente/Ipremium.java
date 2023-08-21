package model.cliente;

interface IPremium extends ICliente {

    float getDesconto();

    void setDesconto(float desconto);

    float getMensalidade();

    void setMensalidade(float mensalidade);

}