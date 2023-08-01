package model.cliente;

import java.util.Vector;

class Cliente {
	String nome;
	int CPF;
	Vector<Cartoes> cartoes;
	
	String getNome() {
		return this.nome;
	}
	
	Vector<Cartoes> getCartoes(){
		return this.cartoes;
	}
	
	void addCartao(Cartoes cartao) {
		this.cartoes.add(cartao);
	}

}
