package model.compra;
import model.estoque.Item;

class ItemCompra {
	Item item;
	int quantia;
	
	public ItemCompra(Item item, int quantia) {
		this.item = item;
		this.quantia = quantia;
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
