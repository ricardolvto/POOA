package model.cliente;

import java.util.Vector;

class Cliente implements iCliente{
	String nome;
	int CPF;
	Vector<Cartoes> cartoes;
	
	public String getNome() {
		return this.nome;
	}
	
	public Vector<Cartoes> getCartoes(){
		return this.cartoes;
	}
	
	public void addCartao(int num, int val, int cvs) {
		Cartoes cartao = new Cartoes(num, val, cvs);
		this.cartoes.add(cartao);
	}

}
