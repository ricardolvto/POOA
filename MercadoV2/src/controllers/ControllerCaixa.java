package controllers;

// used only for testing
import model.estoque.*;
import model.funcionario.*;

import java.util.Scanner;

import model.compra.CaixaFisico;
import model.compra.*;

public class ControllerCaixa {
	
	Estoque estoque;
	BancoFunc funcionario;
	
	public ControllerCaixa(){};
	

	public void usaCaixa() {
		CaixaFisico caixaF = new CaixaFisico();
		Estoque estoque = Estoque.getInstancia();
		
	    Scanner ler = new Scanner(System.in);
	    int a;
		double qnt;
	    String code;
	    boolean iniV = false, ini2 = true;
	    iVenda venda = new Venda();
		
		
		caixaF.cadastrar_entrada();
		
		System.out.println("\nIniciar Venda? 1(Yes) 2(No)");
		a = ler.nextInt();
		
		if(a == 1) {
			iniV = true;
			venda = new Venda();
			venda.iniciaVenda();
		}else {
			iniV = false;
		}
		while(iniV == true) {
				while(ini2 == true && iniV == true) {
					System.out.println("Adicionar Item? 1(Yes) 2(No)");
					a = ler.nextInt();
					while(a == 1) {
					    ler.nextLine();
						System.out.println("Informe a quantia:");
						qnt = ler.nextDouble();
						if (qnt>0) {
		
						    ler.nextLine();
							System.out.println("Informe o codigo:");
							code = ler.nextLine();
							if(estoque.existe((String)code)) {
								venda.adicionaProduto((String)code, qnt);
							}else {
								System.out.println("O codigo informado nao corresponde a nenhum produto");
							}
						}
						System.out.println("Adicionar mais um item? 1(Yes) 2(No)");
						a = ler.nextInt();
						if(a == 1) {ini2 = true;}
						else {ini2 = false;}
					}
				}
				venda.printaProdutos();
				venda.iniciaPagamento();
				venda.updateBanco();
				venda.updateEstoque();
				System.out.println("\nVenda finalizada");
				
				System.out.println("Iniciar Venda? 1(Yes) 2(No)");
				a = ler.nextInt();
				if(a == 1) {
					iniV = true;
					ini2 = true;
					venda = new Venda();
					venda.iniciaVenda();
				}else {
					iniV = false;
				}
		}
	}
	
	// 
	public void iniciaTeste() {
		this.estoque = Estoque.getInstancia();
		
	    Scanner ler = new Scanner(System.in);
	    
		estoque.addItem("1", "Copo de Vidro", "é um copo de vidro", "vrido", 1, 2.0, 100);
		estoque.addItem("2", "Cafe Pilão", "Cafe :)", "pilao", 1, 16.5, 220);
		estoque.addItem("3", "Itubaina", "é um refri", "refri", 1, 2.69, 120);
		estoque.addItem("4", "Bananas", "mamaco gosta", "mamaco", 2, 9.79, 120.60);
		
		this.funcionario = BancoFunc.getInstancia();
		funcionario.addFunc(2345, "Ana", 2, "UFSCar");
	}
	
}
