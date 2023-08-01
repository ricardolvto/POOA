package model.pagamento;

class BoletoBancario extends Pagamento{
	
	BoletoBancario(){};

	void inicia(float valor){
		System.out.println("Código do Boleto: 193819738934789274927433");
		System.out.println("Para o valor: " + valor);
		
	}
	void esperaPag(){
		System.out.println("Esperando pagamento...");
	}
	void concluida(){
		System.out.println("Pagamento Concluído! - Boleto pago com sucesso");
	}

	@Override
	void esperaPag(double valorTotal) {
		// TODO Auto-generated method stub
		
	}
}