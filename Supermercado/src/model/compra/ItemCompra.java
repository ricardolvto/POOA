package model.compra;
import model.estoque.iEstoque;

class ItemCompra {
	iEstoque item;
	int quantia;
	
	public ItemCompra(iEstoque item, int quantia) {
		this.item = item;
		this.quantia = quantia;
	}
	
	public double getValor() {
		return this.quantia * this.item.getValorItem();
	}
	
	public double getValorItem() {
		return this.quantia * this.item.getValorItem();
	}
	public String getNome() {
		return this.item.getNomeItem();
	}

}
