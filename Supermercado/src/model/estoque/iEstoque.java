package model.estoque;

public interface iEstoque {
	void addItem(Long code, String nome, String descricao, String fornecedor, float valor);
	void addLote(int loteCode, Long code, String validade, int qnt);
	String getNomeItem(Long code);
	float getValorItem(Long code);
}
