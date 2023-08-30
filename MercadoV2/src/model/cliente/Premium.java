package model.cliente;

import java.util.Vector;

class Premium extends Cliente{

	public Premium() {
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
