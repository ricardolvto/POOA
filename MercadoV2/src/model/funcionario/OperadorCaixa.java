package model.funcionario;

import java.util.Vector;

public class OperadorCaixa extends Funcionario implements iFuncionario{
	
	Vector<HorarioDePonto> pontos;
	
	OperadorCaixa(int CPF, String nome, String endereco){
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = 2500.00;
		this.cargo = "Operador de Caixa";
	}
	
	public void ponto(String ini, String fim) {
		HorarioDePonto hora = new HorarioDePonto(ini, fim);
		this.pontos.add(hora);
	}

	public String getNome() {
		return this.nome;
	}
}
