package model.estoque;

public interface iEstoque {
	// initiating the instance
	Estoque getInstancia();
	
	// addiction of objects
	void addItem(Long code, String nome, String descricao, String fornecedor, double d);
	void addLote(int loteCode, Long code, String validade, int qnt);
	
	// "get" methods
	Item getItem(Long code);
	String getNomeItem(Long code);
	double getValorItem(Long code);
	
	// printing methods
	public void printItens();
	public void printLotes();
}
