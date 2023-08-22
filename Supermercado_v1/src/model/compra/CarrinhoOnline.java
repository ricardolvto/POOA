package model.compra;
import model.cliente.*;
import java.util.Vector;

public class CarrinhoOnline {
		iCliente cliente;
		ListaCompra listaCompra;
		
		CarrinhoOnline(iCliente cliente){
			this.cliente = cliente;
			this.listaCompra = new ListaCompra();
		}
		
		public ListaCompra getLista(){
			return this.listaCompra;
		}
		
}
