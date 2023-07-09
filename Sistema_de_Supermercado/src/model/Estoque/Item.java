package model.Estoque;

public class Item {
	String nome; 
	float valor;
	float gasto;
	float valorCompra;
	String Fornecedor;
	int setor;
	String descricao;

	Item(){};
	
	Item(String n, float v, float g, String f, int s, String d){
		this.nome = n;
		this.valor = v;
		this.gasto = g;
		this.Fornecedor = f;
		this.setor = s;
		this.descricao = d;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public float getGasto() {
		return this.gasto;
	}
	
}
