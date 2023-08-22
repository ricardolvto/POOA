package controllers;

import java.util.Scanner;

import model.compra.*;


public class ControllerVendaOnline {
	ControllerVendaOnline(){};
	
	void vendaOnline(CarrinhoOnline carrinho) {
		
	    Scanner ler = new Scanner(System.in);
	    int a, qnt;
	    String code;
	    boolean ini = false;
		Venda venda = new Venda(carrinho.getLista());
		
		
		venda.iniciaVenda();
		ini = false;
		while(ini == false) {
			System.out.println("Adicionar Item? 1(Yes) 2(No)");
			a = ler.nextInt();
			while(a == 1) {
				System.out.println("Informe a quantia:");
				qnt = ler.nextInt();
				System.out.println("Informe o codigo:");
				code = ler.toString();
				venda.adicionaProduto((String)code, qnt);
				
				System.out.println("Adicionar mais um item? 1(Yes) 2(No)");
				a = ler.nextInt();
			}
		}
		venda.printaProdutos();
		venda.iniciaPagamento();
	}
}
