package model.cliente;

public interface IPremium extends iCliente {

    float getDesconto();

    void setDesconto(float desconto);

    float getMensalidade();

    void setMensalidade(float mensalidade);

}