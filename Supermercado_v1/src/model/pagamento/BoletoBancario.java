package model.pagamento;

public class BoletoBancario extends Pagamento{
	
	public BoletoBancario(){};

	public void esperaPag(double valor){
		System.out.println("Código do Boleto: 193819738934789274927433");
		System.out.println("Esperando o pagamento do boleto com o valor: " + valor);
	}
	public void concluida(){
		System.out.println("Pagamento Concluído! - Boleto pago com sucesso");
	}
}