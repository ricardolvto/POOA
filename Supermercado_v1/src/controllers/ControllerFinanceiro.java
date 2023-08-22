package controllers;

import model.financeiro.*;
import model.funcionario.BancoFunc;
import model.compra.BancoVenda;

public class ControllerFinanceiro {
	ControllerFinanceiro(){};
	
	public void calculaTudo() {
		BancoFunc bF = BancoFunc.getInstancia();
		BancoVenda bV = BancoVenda.getInstancia();
		BancoContas bC = BancoContas.getInstancia();

		System.out.print("Total das vendas: " + bV.getVendaTotal());
		System.out.print("Gastos com salarios: " + bF.getSalFuncs());
		System.out.print("Gastos com contas: " + bC.getTotalContas());
		System.out.print("Total: " + (bV.getVendaTotal() - (bF.getSalFuncs() + bC.getTotalContas())));
		
	}

}
