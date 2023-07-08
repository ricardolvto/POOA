package model.CompraOnline;

public class Entrega {
	String endereco;
	boolean entregue;
	
	Entrega(String endereco){
		this.endereco = endereco;
		this.entregue = false;
	};
	
	void entregaEntregue() {
		this.entregue = true;
	}
}
