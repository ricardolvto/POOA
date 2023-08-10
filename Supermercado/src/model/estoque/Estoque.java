//Singleton

package model.estoque;

import java.util.Vector;

class Estoque implements iEstoque{
	
	Vector<Item> item;
	Vector<Lote> lote;
	private static Estoque instancia;
	
	Estoque(){};
	
	public Estoque getInstancia() {
        if (instancia == null) {
        	instancia = new Estoque();
        }
        return instancia;
    }

	@Override
	public void addItem(Long code, String nome, String descricao, String fornecedor, double d) {
		if(this.item == null) {this.item = new Vector<>();}
		Item item = new Item(code, nome, descricao, fornecedor, d);
		this.item.add(item);
	}

	public void addLote(int loteCode, Long code, String validade, int qnt) {
		if(this.lote == null) {this.lote = new Vector<>();}
		Item novoItemdoLote = new Item();
		
		for (Item auxItem : this.item) {
            if (auxItem.getCode().equals(code)) {
            	auxItem.disponivel();
            	novoItemdoLote = auxItem;
                break;
            }
        }
		
		Lote lote = new Lote(loteCode, novoItemdoLote, validade, qnt);
		this.lote.add(lote);
	}

	public String getNomeItem(Long code) {
			for (Item auxItem : this.item) {
	            if (auxItem.getCode().equals(code)) {
	            	return auxItem.nome;
	            }
			}
        	return "";
	}

	public Item getItem(Long code) {
			for (Item auxItem : this.item) {
	            if (auxItem.getCode().equals(code)) {
	            	return auxItem;
	            }
			}
        	return null;
	}


	public double getValorItem(Long code) {
		for (Item auxItem : this.item) {
            if (auxItem.getCode().equals(code)) {
            	return auxItem.valor;
            }
		}
    	return -1;
		
	}


	public void printItens() {
		for (Item auxItem : this.item) {
            auxItem.printItem();
		}
	}


	public void printLotes() {
		for (Lote auxLote : this.lote) {
			auxLote.printLote();
		}
		
	}


}
