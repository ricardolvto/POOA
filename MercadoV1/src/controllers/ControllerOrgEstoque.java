package controllers;

import model.estoque.*;

public class ControllerOrgEstoque {
	//not finished yet 
	ControllerOrgEstoque(){};
	
	void adicionaAoEstoque() {
		String code = "Nome", nome = "Nome", descricao = "Nome", fornecedor = "Nome";
		double d = 100;
		
		Estoque estoque = Estoque.getInstancia();
		
		estoque.addItem(code, nome, descricao, fornecedor, d);
	}
}
