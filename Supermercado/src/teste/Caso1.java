package teste;

import java.util.Scanner;

import model.funcionario.*;
import model.funcionario.FuncFactory;
import model.compra.*;
import model.estoque.*;
import model.pagamento.*;


public class Caso1 {

	public static void main(String[] args) {
		Estoque estoque = Estoque.getInstancia();
		CaixaFisico caixaF = new CaixaFisico();
		Venda venda = new Venda();
		
	    Scanner ler = new Scanner(System.in);
	    int a, qnt;
	    boolean ini = false;
		
		long valor = 11, valor2 = 22, valor3 = 3;
		estoque.addItem(valor, "Copo de Vidro", "é um copo de vidro", "vrido", 2.0);
		estoque.addItem(valor2, "Cafe Pilão", "Cafe :)", "pilao", 16.5);
		estoque.addItem(valor3, "Itubaina", "é um refri", "refri", 2.69);
		
		FuncFactory caixa1 = new FuncFactory();
		caixa1.getFuncionario(2345, "Ana", 2, "UFSCar");
		
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
			if(a == 1) {
				System.out.println("Informe a quantia:");
				qnt = ler.nextInt();
				ItemCompra itemCompra = new ItemCompra(new Item(valor, "Copo de Vidro", "é um copo de vidro", "vrido", 2.0), qnt);
				ini = true;
				venda.adicionaProduto(itemCompra);
			}
		}
		venda.iniciaPagamento();

	}

}
