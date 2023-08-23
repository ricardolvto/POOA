//Template Method
package model.pagamento;

import java.util.Scanner;

import model.compra.Venda;

public abstract class Pagamento{
	
	Pagamento(){};
	
	public final void iniciaPagamento(double valorTotal, Venda venda){
		inicia();
		esperaPag(valorTotal);
		concluida();
		confirma(venda);
	}
	
	abstract void esperaPag(double valorTotal);
	abstract void concluida();
	
	public final void confirma(Venda venda){
		Scanner inpt = new Scanner(System.in);
		System.out.println("cancelar compra? 0(CANCELAR) 1(cONFIRMAR)");
		int x = inpt.nextInt();
		if(x == 1)
		venda.setStatus(true);
		else
		System.out.println("compra cancelada");

		inpt.close();
	}

	final void inicia() {
		System.out.println("Iniciando etapa de pagamento...");
	}
}
