package model.estoque;

public class Item{
	String codigo;
	String nome;
	String descricao;
	String fornecedor;
	double valor;
	int quantia;
	boolean disponivel;
	
	public Item() {};

	public Item(String code, String nome, String descricao, String fornecedor, double d) {
		this.codigo = code;
		this.nome = nome;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.valor = d;
		this.quantia = 0;
		this.disponivel = false;
	}
	
	public double getValor() {
		return this.valor;
	}

	public String getCode() {
		return this.codigo;
	}
	public boolean disponivel() {
		return this.disponivel;
	}

	public String getNome() {
		return this.nome;
	}
	
	
	public void printItem() {//+"\n Valor:"
		System.out.println("-----------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Valor: "+this.valor);
		System.out.println("Descrição: "+this.descricao);
		if(this.disponivel)
			System.out.println("Disponivel");
		else
			System.out.println("Indisponivel");
	}

}
