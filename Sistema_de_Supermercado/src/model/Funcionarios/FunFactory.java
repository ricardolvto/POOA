package model.Funcionarios;

public class FunFactory {
    public static Funcionario criarFuncionario(String tipo, String nome, int CPF, int t, int ht, String iB, String aR) {
        if (tipo.equalsIgnoreCase("Gerente")) {
            return new Gerente(nome, CPF, t, ht, iB, aR);
        } else if (tipo.equalsIgnoreCase("OperadorCaixa")) {
            return new OperadorCaixa(nome, CPF, t, ht, iB);
        } else {
            throw new IllegalArgumentException("Tipo de funcionário inválido: " + tipo);
        }
    }
}
