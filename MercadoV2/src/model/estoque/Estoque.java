//Singleton, logo nao pode ter interface

package model.estoque;

import java.util.Vector;

public class Estoque{
	
	Vector<Item> item;
	private static Estoque instancia = null;
	
	Estoque(){};
	
	public static Estoque getInstancia() {
        if (instancia == null) {
        	instancia = new Estoque();
        }
        return instancia;
    }

	public void addItem(String code, String nome, String descricao, String fornecedor, double d) {
		if(this.item == null) {this.item = new Vector<>();}
		Item item = new Item(code, nome, descricao, fornecedor, d);
		this.item.add(item);
	}
	
	public boolean mudaQntItem(String code, double qnt){
		int i=0;
		for (I_Item auxItem : this.item) {
			
            if (auxItem.getCode().equals(code)) {
            	
            	if(this.item.get(i).quantia+qnt>0) {
        			this.item.get(i).quantia += qnt;
        			this.item.get(i).disponivel = true;
        			return true;

        		}else if(this.item.get(i).quantia+qnt == 0) {
        			this.item.get(i).quantia += qnt;
        			this.item.get(i).disponivel = false;
        			return true;
        			
        		}else {
        			System.out.println("Quantidade de itens indisponível.");
        			return false;
        		}
            }
            i++;
		}
		return false;
		
	}

	public String getNomeItem(String code) {
			for (Item auxItem : this.item) {
	            if (auxItem.getCode().equals(code)) {
	            	return auxItem.nome;
	            }
			}
        	return "";
	}

	public I_Item getItem(String code) {
			for (I_Item auxItem : this.item) {
	            if (auxItem.getCode().equals(code)) {
	            	return auxItem;
	            }
			}
        	return null;
	}

	public String getstock_completo()
	{
		return item.toString();
	}

	public double getValorItem(String code) {
		for (Item auxItem : this.item) {
            if (auxItem.getCode().equals(code)) {
            	return auxItem.valor;
            }
		}
    	return -1;
	}


	public void printItens() {
		for (I_Item auxItem : this.item) {
            auxItem.printItem();
		}
	}
}
