package model.compra;
import model.estoque.*;

public class ItemCompra {
	Item item;
	int quantia;
	
	public ItemCompra(Item item, int quantia) {
		this.item = item;
		this.quantia = quantia;
	}
	
	public double getValor() {
		return this.quantia * this.item.getValor();
	}

}
