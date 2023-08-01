package model.funcionario;

public class Funcionario {
	int CPF;
	String cargo;
	String nome;
	String endereco;
	double salario;

	void setEndereco(String end) {
		this.endereco = end;
	}
	String getEndereco() {
		return this.endereco;
	}

	void setNome(String nome) {
		this.nome = nome;
	}
	String getNome() {
		return this.nome;
	}

	int getCPF() {
		return this.CPF;
	}
	
}
