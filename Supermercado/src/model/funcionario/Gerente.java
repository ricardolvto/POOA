package model.funcionario;

class Gerente extends Funcionario{
	
	Gerente(int CPF, String nome, String endereco){
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = 20000.00;
	}

}
