package model.compra;
import model.estoque.I_Item;

class ItemCompra {
	I_Item item;
	float quantia;
	
	public ItemCompra(I_Item item, float quantia) {
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
