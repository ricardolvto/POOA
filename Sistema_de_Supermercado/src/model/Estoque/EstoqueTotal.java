package model.Estoque;

import java.util.Vector;

public class EstoqueTotal {
	
	Vector<Lote> lote;
	
	EstoqueTotal(){
		this.lote = new Vector<>();
	};
	
	boolean adicionaLote(Lote lote){
		if(this.lote.add(lote))
			return true;
		else return false;
	}
	
}
