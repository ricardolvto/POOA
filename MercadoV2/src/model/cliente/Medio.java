package model.cliente;

import java.util.Vector;

class Medio extends Cliente{

	public Medio() {
		
	}

	public String getNome() {
		return this.nome;
	}
	
	public Vector<Cartoes> getCartoes(){
		return this.cartoes;
	}
	
	void addCartao(Cartoes cartao) {
		this.cartoes.add(cartao);
	}
}

