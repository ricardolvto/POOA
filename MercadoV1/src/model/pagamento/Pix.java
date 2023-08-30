package model.pagamento;

public class Pix extends Pagamento{
	
	public Pix(){};

	public void esperaPag(double valor){
		System.out.println("Pix copia e cola: Ajklpan**skjalsd*");
		System.out.println("Esperando o pagamento pix para o valor: " + valor);
	}
	public void concluida(){
		System.out.println("Pagamento Concluído! - Pix feito com sucesso");
	}

}
