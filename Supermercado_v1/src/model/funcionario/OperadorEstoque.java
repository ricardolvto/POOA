package model.funcionario;

class OperadorEstoque extends Funcionario{
	
	OperadorEstoque(int CPF, String nome, String endereco){
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = 1600.00;
		this.cargo = "Operador de Estoque";
	}

}