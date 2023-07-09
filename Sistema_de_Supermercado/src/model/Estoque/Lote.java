package model.Estoque;

public class Lote {
	Item item;
	int validade;
	int qnt;
	int loteCodigo;
	
	Lote(){};
	
	Lote(Item item, int v, int qnt, int lote){
		this.item = item;
		this.validade = v;
		this.qnt = qnt;
		this.loteCodigo = lote;
	}

}
