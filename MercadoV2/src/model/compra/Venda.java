package model.compra;

import model.pagamento.*;
import model.estoque.*;
import java.util.Scanner;

public class Venda implements iVenda{
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
	
	public void adicionaProduto(String code, float qnt) {
		Estoque e = Estoque.getInstancia();
		ItemCompra item = new ItemCompra(e.getItem(code), qnt);
		
		this.lista.addItem(item);
		
		this.valorTotal += item.getValor(code);
	}
	public boolean updateEstoque() {
		Estoque e = Estoque.getInstancia();
		
		for (ItemCompra auxItem : this.lista.lista) {
			if(e.mudaQntItem(auxItem.item.getCode(), -auxItem.quantia)) {
				
			}else {
				return false;
			}
		}
		
		return true;
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
		    if(a == 3) {
		    	Dinheiro dinheiro = new Dinheiro();
		    	dinheiro.iniciaPagamento(this.valorTotal);
		    	ok = true;
		    }
		}
		
		BancoVenda bv = BancoVenda.getInstancia();
		bv.addVenda(this);
		
	}
	public void printaProdutos() {
		for (ItemCompra auxList : this.lista.lista) {
			
			System.out.println(auxList.item.getNome() + " x" + auxList.quantia + " R$" + auxList.item.getValor());
		}
		System.out.println(" Total da Compra:" + this.valorTotal);
	}

}
