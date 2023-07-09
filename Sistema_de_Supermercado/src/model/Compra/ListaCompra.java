package model.Compra;

import java.util.Vector;
import model.Estoque.Item;

public class ListaCompra { 
	Vector<ItemCompra> itens;
	float total;
	float gasto;
	float lucro;
	
	ListaCompra(){
		itens = new Vector<>();
	};
	
	boolean adicionaItem(Item item, int qnt){
		ItemCompra itemCompra = new ItemCompra(item, qnt);
		this.total += (item.getValor())*qnt;
		this.gasto += (item.getGasto())*qnt;
		this.lucro += this.total - this.gasto;
		return this.itens.add(itemCompra);
	}
	
	boolean removeItem(ItemCompra item) {
		return this.itens.remove(item);
	} 
	
	public float getLucro() {
		return this.lucro;
	}
}
