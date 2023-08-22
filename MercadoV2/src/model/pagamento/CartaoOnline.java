package model.pagamento;

import model.cliente.Cartao;

class CartaoOnline extends Pagamento{
	
	CartaoOnline(){};

	void inicia(Cartao cartao, double valor){
		System.out.println("Cartao" + cartao.getNumero_cart() +": " + valor);
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
