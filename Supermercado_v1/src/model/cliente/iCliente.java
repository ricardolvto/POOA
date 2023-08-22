package model.cliente;

import java.util.Vector;

public interface iCliente {
	String getNome();
	
	Vector<Cartoes> getCartoes();
	
	void addCartao(int num, int val, int cvs);
}
