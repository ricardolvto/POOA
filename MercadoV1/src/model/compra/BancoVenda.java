package model.compra;

import java.util.Vector;

public class BancoVenda {
	Vector<Venda> listaVenda;
	private static BancoVenda instancia = null;
	
	BancoVenda(){};
	
	public static BancoVenda getInstancia() {
        if (instancia == null) {
        	instancia = new BancoVenda();
        }
        return instancia;
    }

	public void addVenda(Venda venda) {
		if(this.listaVenda == null) {this.listaVenda = new Vector<>();}
		this.listaVenda.add(venda);
	}
	

	public double getVendaTotal() {
		double total = 0;
		for (Venda auxVenda : this.listaVenda) {
            total += auxVenda.valorTotal;
		}
    	return total;
	}


}

