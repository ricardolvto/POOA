package teste;

import controllers.ControllerCaixa;
import controllers.ControllerFinanceiro;

public class Main {

	public static void main(String[] args) {
		ControllerCaixa cc = new ControllerCaixa();
		ControllerFinanceiro cf = new ControllerFinanceiro();
		
		cc.iniciaTeste();
		cc.usaCaixa();
		cf.addConta(2345678, 532.90, true, "14/08/2023", "Conta de Água");
		cf.addConta(2345678, 532.90, true, "14/08/2023", "Conta de Luz");
		cf.relatorio();

	}

}
