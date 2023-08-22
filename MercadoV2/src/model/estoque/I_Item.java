package model.estoque;

public interface I_Item {

    double getValor();

    String getCode();

    boolean disponivel();

    String getNome();

    void printItem();

}