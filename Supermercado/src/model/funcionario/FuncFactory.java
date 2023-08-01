package model.funcionario;

public class FuncFactory {
	public FuncFactory(){};
	
	public Funcionario getFuncionario(int CPF, String nome, int cargo, String endereco) {
		
		if (cargo == 1)
			return new Gerente(CPF, nome, endereco);
		if (cargo == 2)
			return new OperadorCaixa(CPF, nome, endereco);
		if (cargo == 3)
			return new OperadorEstoque(CPF, nome, endereco);
		else return null;
	}

}
