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

	public void addItem(String code, String nome, String descricao, String fornecedor, int tipo, double d, double qnt) {
		if(this.item == null) {this.item = new Vector<>();}
		
		if(tipo == 1) {
			Item item = new Unitario(code, nome, descricao, fornecedor, iTipo.UNITARIO, d, (int)qnt);
			this.item.add(item);
		}
		
		else if(tipo == 2) {
			Item item = new PorKG(code, nome, descricao, fornecedor, iTipo.PORKG, d, qnt);
			this.item.add(item);
		}
		else {System.out.println("\nTipo inválido!");}
	}
	
	public boolean mudaQntItem(String code, double qnt){
		int i=0;
		for (Item auxItem : this.item) {
			
            if (auxItem.getCode().equals(code)) {
            	
            	if(this.item.get(i).getQnt()+qnt>0) {
        			this.item.get(i).addQnt(qnt);
        			this.item.get(i).disponivel = true;
        			return true;

        		}else if(this.item.get(i).getQnt()+qnt == 0) {
        			this.item.get(i).addQnt(qnt);
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
	
	boolean verificaItem(String code) {
		for (Item auxItem : this.item) {
            if (auxItem.getCode().equals(code)) {
            	if(auxItem.getQnt() > 0) return true;
            	else return false;
            }
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

	public Item getItem(String code) {
			for (Item auxItem : this.item) {
	            if (auxItem.getCode().equals(code)) {
	            	return auxItem;
	            }
			}
        	return null;
	}
	
	public boolean existe(String code) {
		for (Item auxItem : this.item) {
            if (auxItem.getCode().equals(code)) {
            	return true;
            }
		}
    	return false;
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
		for (Item auxItem : this.item) {
            auxItem.printItem();
		}
	}
}
