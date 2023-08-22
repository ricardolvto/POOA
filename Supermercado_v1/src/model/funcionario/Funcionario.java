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
	void setNome(String nome) {
		this.nome = nome;
	}
	
	
	String getEndereco() {
		return this.endereco;
	}
	String getNome() {
		return this.nome;
	}
	double getSalario() {
		return this.salario;
	}
	int getCPF() {
		return this.CPF;
	}
	String getCargo() {
		return this.cargo;
	}
}
