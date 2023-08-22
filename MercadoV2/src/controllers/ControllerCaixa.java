package controllers;

// used only for testing
import model.estoque.*;
import model.funcionario.iFuncFactory;

import java.util.Scanner;

import model.compra.CaixaFisico;
import model.compra.*;

public class ControllerCaixa {
	
	Estoque estoque;
	iFuncFactory caixa1;
	
	ControllerCaixa(){};
	

	void usaCaixa() {
		CaixaFisico caixaF = new CaixaFisico();
		Estoque estoque = Estoque.getInstancia();
		
	    Scanner ler = new Scanner(System.in);
	    int a, qnt;
	    String code;
	    boolean ini = false;
		iVenda venda = new Venda();
		
		
		System.out.println("Por favor informe seu ID:");
		a = ler.nextInt();
		
		caixaF.cadastrar_entrada((long)a);
		
		while(ini == false) {
			System.out.println("Iniciar Venda? 1(Yes) 2(No)");
			a = ler.nextInt();
			if(a == 1) {
				ini = true;
				venda.iniciaVenda();
			}
		} ini = false;
		while(ini == false) {
			System.out.println("Adicionar Item? 1(Yes) 2(No)");
			a = ler.nextInt();
			while(a == 1) {
				System.out.println("Informe a quantia:");
				qnt = ler.nextInt();
				System.out.println("Informe o codigo:");
				code = ler.toString();
				Item item1 = estoque.getItem((String)code);
				if(item1 != null) {
					venda.adicionaProduto((String)code, qnt);
				}else {
					System.out.println("O codigo informado nao corresponde a nenhum produto");
				}
				
				System.out.println("Adicionar mais um item? 1(Yes) 2(No)");
				a = ler.nextInt();
			}
		}
		venda.printaProdutos();
		venda.iniciaPagamento();
	}
	
	
	
	
	// 
	void iniciaTeste() {
		this.estoque = Estoque.getInstancia();
		
	    Scanner ler = new Scanner(System.in);
		
		String valor = "11", valor2 = "22", valor3 = "33";
		estoque.addItem(valor, "Copo de Vidro", "é um copo de vidro", "vrido", 2.0);
		estoque.addItem(valor2, "Cafe Pilão", "Cafe :)", "pilao", 16.5);
		estoque.addItem(valor3, "Itubaina", "é um refri", "refri", 2.69);
		
		this.caixa1 = new iFuncFactory();
		caixa1.getFuncionario(2345, "Ana", 2, "UFSCar");
	}
	
}
