package model.cliente;

import java.util.Vector;

class Basic extends Cliente{

	public Basic() {
		
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
