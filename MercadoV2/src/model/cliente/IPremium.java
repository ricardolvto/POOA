package model.cliente;

public interface IPremium extends iCliente {

    void setMensalidadePaga(boolean mensalidadePaga);

    double getDesconto();

    void setDesconto(double desconto);

    double getMensalidade();

    void setMensalidade(double mensalidade);

    void tipoCliente();

    boolean getMensalidadePaga();

}