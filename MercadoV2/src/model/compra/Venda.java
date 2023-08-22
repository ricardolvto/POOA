package model.compra;

import model.pagamento.*;
import model.estoque.*;
import java.util.Scanner;

public class Venda implements iVenda {
	ListaCompra lista;
	double valorTotal;
	boolean status = false;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

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
			if (e.mudaQntItem(auxItem.item.getCode(), -auxItem.quantia)) {

			} else {
				return false;
			}
		}

		return true;
	}

	public void iniciaPagamento() {

		Scanner ler = new Scanner(System.in);
		int a;
		System.out.println("Qual a forma de pagamento?");
		a = ler.nextInt();

		if (a == 1) {
			Pix pix = new Pix();
			pix.iniciaPagamento(this.valorTotal, this);
		}
		if (a == 2) {
			BoletoBancario boletoBancario = new BoletoBancario();
			boletoBancario.iniciaPagamento(this.valorTotal, this);
		}
		if (a == 3) {
			Dinheiro dinheiro = new Dinheiro();
			dinheiro.iniciaPagamento(this.valorTotal, this);
		}

		if(this.status == true)
		{
		BancoVenda bv = BancoVenda.getInstancia();
		bv.addVenda(this);
		}

		ler.close();

	}

	public void printaProdutos() {
		for (ItemCompra auxList : this.lista.lista) {

			System.out.println(auxList.item.getNome() + " x" + auxList.quantia + " R$" + auxList.item.getValor());
		}
		System.out.println(" Total da Compra:" + this.valorTotal);
	}

	@Override
	public void adicionaProduto(String code, int qnt) {
		Estoque e = Estoque.getInstancia();
		ItemCompra item = new ItemCompra(e.getItem(code), qnt);

		this.lista.addItem(item);

		this.valorTotal += item.getValor(code);

	}

}
