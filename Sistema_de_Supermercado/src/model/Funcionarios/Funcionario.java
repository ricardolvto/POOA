package model.Funcionarios;

public class Funcionario {
	String nome;
	int CPF;
	int telefone;
	int horasTrabalhadas;
	String infoBancarias;
	
	Funcionario(String nome, int CPF, int t, int ht, String iB){
		this.nome = nome;
		this.CPF = CPF;
		this.telefone = t;
		this.horasTrabalhadas = ht;
		this.infoBancarias = iB;
	}
}
