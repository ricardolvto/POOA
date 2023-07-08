package model.Clientes;

import java.util.Vector;

public abstract class Cliente {
	String nome;
	int CPF;
	int pontos;
	Vector<String> endereco;
	String email;
	String senha;
	
	Cliente(){};
	
	Cliente(String n, int C, int p, String e, String email, String senha){
		this.nome = n;
		this.CPF = C;
		this.pontos = p;
		this.endereco = new Vector<>();
		this.endereco.add(e);
		this.email = email;
		this.senha = senha;
	}

	String getNome() {
		return this.nome;
	}
	int getCPF(int CPF) {
		return this.CPF;
	}
	int getPontos(int pontos) {
		return this.pontos;
	}
}
