//Template Method
package model.pagamento;

public abstract class Pagamento{
	
	Pagamento(){};
	
	public final void iniciaPagamento(double valorTotal) {
		inicia();
		esperaPag(valorTotal);
		concluida();
	}
	
	abstract void esperaPag(double valorTotal);
	abstract void concluida();
	
	final void inicia() {
		System.out.println("Iniciando etapa de pagamento...");
	}
}
