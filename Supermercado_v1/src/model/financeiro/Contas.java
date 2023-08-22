package model.financeiro;

class Contas implements iFinanceiro{
	int codigo;
	double valor;
	boolean paga;
	String data;
	String nomeConta;
	
	Contas(){};
	
	public double getValor() {
		return this.valor;
	}

}
