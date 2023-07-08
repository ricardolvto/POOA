package model.Clientes;

public class ClienteFactory{
    public static Cliente criarCliente(String tipo, String nome, int CPF, int pontos, String endereco, String email, String senha) {
        if (tipo.equalsIgnoreCase("Basico")) {
            return new Basico(nome, CPF, pontos, endereco, email, senha);
        } else if (tipo.equalsIgnoreCase("Premium")) {
            return new Premium(0, 0); // Define os valores iniciais para desconto e mensalidade
        } else {
            throw new IllegalArgumentException("Tipo de cliente inválido: " + tipo);
        }
    }
}
