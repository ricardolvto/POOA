package controllers;

import model.cliente.iCliente;

public class ControllerCliente {
		ControllerCliente(){};
		
		void addCliente() {
			
		}
		public void addCartao(iCliente cliente) {
			int numero=0, validade=0, cvs=192;
			cliente.addCartao(numero, validade, cvs);
		}
		
}
