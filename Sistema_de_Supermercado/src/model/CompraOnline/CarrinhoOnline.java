package model.CompraOnline;

import java.util.Vector;
import model.Clientes.*;
import model.Compra.*;
import model.Estoque.*;

public class CarrinhoOnline {
	Cliente cliente;
	Vector<ItemCompra> itens;
	
	CarrinhoOnline(){};
	
	CarrinhoOnline(Cliente c){
		this.cliente = c;
		this.itens = new Vector<>();
	}

	public boolean adicionaItem(Item i, int qnt){
		return (this.itens.add(new ItemCompra(i, qnt)));
	}
	
	public boolean removeItem(Item i){
		return (this.itens.remove(new ItemCompra(i, 1)));
	}
}
