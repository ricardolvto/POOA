package model.Funcionarios;

public class OperadorCaixa extends Funcionario{
	int pontos;

	OperadorCaixa(String nome, int CPF, int t, int ht, String iB) {
		super(nome, CPF, t, ht, iB);
		pontos = 0;
	}
	
	void adicionaPonto(int pontos) {
		this.pontos += pontos;
	}
}
