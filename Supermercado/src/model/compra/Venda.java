package model.compra;

import model.estoque.Item;
import model.pagamento.*;
import java.util.Scanner;

public class Venda {
	ListaCompra lista;
	double valorTotal;
	int status;
	
	public Venda() {
		this.lista = new ListaCompra();
	};
	public Venda(ListaCompra lista) {
		this.lista = lista;
	};
	
	public void iniciaVenda() {
		System.out.println("Venda Iniciando!");
	}
	public void adicionaProduto(ItemCompra item) {
		this.lista.addItem(item);
		this.valorTotal += item.getValor();
	}
	public void iniciaPagamento() {
		boolean ok = false;
	    Scanner ler = new Scanner(System.in);
	    int a;
		System.out.println("Qual a forma de pagamento?");
		a = ler.nextInt();
		
		while(!ok) {
		    if(a == 1) {
		    	Pix pix = new Pix();
		    	pix.iniciaPagamento(this.valorTotal);
		    	ok = true;
		    }
		    if(a == 2) {
		    	BoletoBancario boletoBancario = new BoletoBancario();
		    	boletoBancario.iniciaPagamento(this.valorTotal);
		    	ok = true;
		    }
		}
		
	}
	public void printaProdutos() {
		for (ItemCompra auxList : this.lista.lista) {
			System.out.println(auxList.item.getNome() + " x" + auxList.quantia + " R$" + auxList.getValor());
		}
		System.out.println(" Total da Compra:" + this.valorTotal);
	}

}
