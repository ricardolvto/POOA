package model.compra;
import model.cliente.*;
import java.util.Vector;

class CarrinhoOnline {
		iCliente cliente;
		Vector<ListaCompra> listaCompra;
		
		CarrinhoOnline(iCliente cliente){
			this.cliente = cliente;
			this.listaCompra = new Vector<>();
		}
		
}
