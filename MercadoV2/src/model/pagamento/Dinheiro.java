package model.pagamento;

import java.util.Scanner;

public class Dinheiro extends Pagamento{
	public Dinheiro(){};

	public void esperaPag(double valor){
	    Scanner ler = new Scanner(System.in);
	    float a;
		System.out.println("Quanto foi dado?");
		a = ler.nextFloat();

		System.out.println("Pagamento no valor: " + valor);
		System.out.println("Total entregue:  " + a);
		System.out.println("Troco:  " + (a - valor));
		ler.close();
	}
	public void concluida(){
		System.out.println("Pagamento Concluído! - Pix feito com sucesso");
	}

}
