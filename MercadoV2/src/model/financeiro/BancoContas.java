package model.financeiro;

import java.util.Vector;

public class BancoContas {

	Vector<Contas> listaContas;
	private static BancoContas instancia = null;
	
	BancoContas(){};
	
	public static BancoContas getInstancia() {
        if (instancia == null) {
        	instancia = new BancoContas();
        }
        return instancia;
    }

	public void addConta(Contas conta) {
		if(this.listaContas == null) {this.listaContas = new Vector<>();}
		this.listaContas.add(conta);
	}
	

	public double getTotalContas() {
		double total = 0;
		for (Contas auxConta : this.listaContas) {
            total += auxConta.valor;
		}
    	return total;
	}
}
