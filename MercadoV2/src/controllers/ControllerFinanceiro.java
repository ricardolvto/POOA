package controllers;

import model.financeiro.*;

public class ControllerFinanceiro {
	public ControllerFinanceiro(){};
	
	public void addConta(int codigo, double valor, boolean paga, String data, String nomeConta) {
		BancoContas bc = BancoContas.getInstancia();
		
		bc.addConta(codigo, valor, paga, data, nomeConta);
	}
	
	public void relatorio() {
		Relatorio r = new Relatorio();
		r.calculaTudo();
	}

}
