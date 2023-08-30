package model.compra;

import java.util.Vector;

class ListaCompra {
	Vector<ItemCompra> lista;
	
	public ListaCompra() {
		this.lista = new Vector<>();
	}
	
	public void addItem(ItemCompra item) {
		this.lista.add(item);
	}

}
