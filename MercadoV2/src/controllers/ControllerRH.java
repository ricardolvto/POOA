package controllers;

import model.funcionario.BancoFunc;

public class ControllerRH {
	//not finished 
	ControllerRH(){};
	
	void adicionaFuncionario() {
		int code = 111, cargo = 1;
		String nome = "Ana", endereco = "UFSCar";
		
		BancoFunc bf = BancoFunc.getInstancia();
		bf.addFunc(code, nome, cargo, endereco);
	}
}
