package model.Compra;

import model.Estoque.Item;

public class ItemCompra {
	Item itens;
	float quantidade;
	
	public ItemCompra(Item item, float qnt){
		this.itens = item;
		this.quantidade = qnt;
	};
	
	float addMaisItem(float extra) {
		this.quantidade += extra;
		return this.quantidade;
	}

}
