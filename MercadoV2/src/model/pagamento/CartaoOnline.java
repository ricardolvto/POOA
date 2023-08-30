package model.pagamento;

class CartaoOnline extends Pagamento{
	
	CartaoOnline(){};

	void inicia(float valor){
		System.out.println("Insira o Cartao na maquininha...");
		System.out.println("Para o valor: " + valor);
		
	}
	void esperaPag(){
		System.out.println("Esperando a resposta da maquininha...");
	}
	void concluida(){
		System.out.println("Pagamento Concluído! - Transação aceita");
	}

	@Override
	void esperaPag(double valorTotal) {
		// TODO Auto-generated method stub
		
	}
}
