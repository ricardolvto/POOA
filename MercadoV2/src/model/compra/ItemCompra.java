package model.compra;
import model.estoque.Item;

class ItemCompra {
	Item item;
	double quantia;
	
	public ItemCompra(Item item, double qnt) {
		this.item = item;
		if(this.item.getTipo() == 1) {
			int i = (int)qnt;
			this.quantia = i;}
		else if (this.item.getTipo() == 2)
			this.quantia = qnt;
	}
	
	public double getValor(String code) {
		return this.quantia * this.item.getValor();
	}
	
	public double getValorItem(String code) {
		return this.quantia * this.item.getValor();
	}
	public String getNome(String code) {
		return this.item.getNome();
	}

}
