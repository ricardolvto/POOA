package model.estoque;

public class Item{
	String codigo;
	String nome;
	String descricao;
	String fornecedor;
	iTipo tipo;
	double valor;
	boolean disponivel;
	
	public Item() {};

	public Item(String code, String nome, String descricao, String fornecedor, iTipo tipo, double d) {
		this.codigo = code;
		this.nome = nome;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.valor = d;
		this.tipo = tipo;
		this.disponivel = true;
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

	public double addQnt(double qnt) {
		return 0;
	}
	public double getQnt() {
		return 0;
	}
	public int getTipo() {
		if(this.tipo == iTipo.UNITARIO)
			{return 1;}
		else if(this.tipo == iTipo.PORKG)
			{return 2;}
		return -1;
	}

}
