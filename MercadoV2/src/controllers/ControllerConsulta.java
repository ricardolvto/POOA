package controllers;

import model.estoque.Estoque;

public class ControllerConsulta {
	ControllerConsulta(){};
	
	public void printItem(String code){
		Estoque e = Estoque.getInstancia();

		System.out.println(e.getNomeItem(code));
		System.out.println("R$: " + e.getValorItem(code));
	}

}
