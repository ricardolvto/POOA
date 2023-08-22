package model.financeiro;

import model.compra.BancoVenda;
import model.funcionario.BancoFunc;

public class Relatorio {
	Relatorio(){};

	
	public void calculaTudo() {
		BancoFunc bF = BancoFunc.getInstancia();
		BancoVenda bV = BancoVenda.getInstancia();
		BancoContas bC = BancoContas.getInstancia();

		System.out.print("| ---------- Todas as vendas realizadas ---------- |");
		bV.printVendas();

		System.out.print("| Total das vendas: " + bV.getVendaTotal());
		System.out.print("| Gastos com salarios: " + bF.getSalFuncs());
		System.out.print("| Gastos com contas: " + bC.getTotalContas());
		System.out.print("| Total: " + (bV.getVendaTotal() - (bF.getSalFuncs() + bC.getTotalContas())));
		
	}
	
}
