package model.financeiro;

import model.compra.BancoVenda;
import model.funcionario.BancoFunc;

public class Relatorio {
	public Relatorio(){};

	
	public void calculaTudo() {
		BancoFunc bF = BancoFunc.getInstancia();
		BancoVenda bV = BancoVenda.getInstancia();
		BancoContas bC = BancoContas.getInstancia();

		System.out.print("| ---------- Todas as vendas realizadas ---------- |\n");
		bV.printVendas();

		if(bV!=null) {
		System.out.print("\n| Total das vendas: " + bV.getVendaTotal());}
		
		if(bF!=null) {
			System.out.print("\n| Gastos com salarios: " + bF.getSalFuncs());
		}
		if(bV!=null) {
			System.out.print("\n| Gastos com contas: " + bC.getTotalContas());
		}
		if(bF!=null && bV!=null && bC!=null) {
			System.out.print("\n| Total: " + (bV.getVendaTotal() - (bF.getSalFuncs() + bC.getTotalContas())));
		}
		
	}
	
}
