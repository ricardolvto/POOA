package model.estoque;

public class Item implements I_Item{
	String codigo;
	String nome;
	String descricao;
	String fornecedor;
	double valor;
	float quantia;
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
	
	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public String getCode() {
		return this.codigo;
	}
	@Override
	public boolean disponivel() {
		return this.disponivel;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
	
	@Override
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
