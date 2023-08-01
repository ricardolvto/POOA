package model.estoque;

class Lote {
	Item item;
	int loteCode;
	String data;
	int quantidade;
	
	Lote(int loteCode, Item item, String data, int qnt){
		this.item = item;
		this.data = data;
		this.quantidade = qnt;
	};


	int getCode() {
		return this.loteCode;
	}

}
