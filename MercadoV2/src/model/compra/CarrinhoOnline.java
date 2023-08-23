package model.compra;
import model.cliente.*;

public class CarrinhoOnline {
		iCliente cliente;
		ListaCompra listaCompra;
		
		public CarrinhoOnline(iCliente cliente){
			this.cliente = cliente;
			this.listaCompra = new ListaCompra();
		}
		
		public ListaCompra getLista(){
			return this.listaCompra;
		}
		
}
