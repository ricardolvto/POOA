package model.financeiro;

class Contas implements iFinanceiro{
	int codigo;
	double valor;
	boolean paga;
	String data;
	String nomeConta;

	Contas(){};
	Contas(int codigo, double valor, boolean paga, String data, String nomeConta){
		this.codigo = codigo;
		this.valor = valor;
		this.paga = paga;
		this.data = data;
		this.nomeConta = nomeConta;
	};
	
	public double getValor() {
		return this.valor;
	}

}
