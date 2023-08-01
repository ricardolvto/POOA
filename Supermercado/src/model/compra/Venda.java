package model.compra;

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
		this.valorTotal = item.getValor();
	}
	public void iniciaPagamento() {
	    Scanner ler = new Scanner(System.in);
	    int a;
		System.out.println("Qual a forma de pagamento?");
		a = ler.nextInt();
	    
	    if(a == 1) {
	    	Pix pix = new Pix();
	    	pix.iniciaPagamento(this.valorTotal);
	    }
		
	}

}
