package model.estoque;

public class Item {
	Long codigo;
	String nome;
	String descricao;
	String fornecedor;
	double valor;
	boolean disponivel;
	
	public Item(Long code, String nome, String descricao,String fornecedor, double d){
		this.codigo = code;
		this.nome = nome;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.valor = d;
		this.disponivel = false;
	};

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public double getValor() {
		return this.valor;
	}

	Long getCode() {
		return this.codigo;
	}
	void disponivel() {
		this.disponivel = true;
	}
	void indisponivel() {
		this.disponivel = false;
	}
}
