package controllers;

import java.util.Scanner;

import model.cliente.*;
import model.compra.*;
import model.estoque.*;
import model.pagamento.Pagamento;

public abstract class ControllerCliente {

	Scanner inpt = new Scanner(System.in);

	
	public abstract iCliente CriaCliente();

	public void addCard(iCliente cliente) {
		Cartao cartao = new Cartao();

		System.out.println("informe o numero do cartao: ");
		cartao.setNumero_cart(inpt.nextLine());

		System.out.println("informe o nome");
		cartao.setNome(inpt.nextLine());

		System.out.println("informe o numero de segurança");
		cartao.setCod_seguranca(inpt.nextLine());

		cliente.addCartao(cartao);
		System.out.println("Cartao adicionado");

	}

	public void removeCard(iCliente cliente) {
		System.out.println("informe o numero do cartao: ");
		String numero_cart = inpt.nextLine();

		cliente.removeCartao(cliente.getCartao(numero_cart));

		System.out.println("cartao removido");
	}


	public void RealizarPagamento(Pagamento pagamento, Venda venda, double valor) {
		pagamento.iniciaPagamento(valor, venda);
	}

	

	public void vizualizarEstoque() {
		Estoque estoque = Estoque.getInstancia();
		System.out.println(estoque.getstock_completo());

	}

	public void CadastroCliente(IBasic cliente) {
        System.out.println("informe nome:");
        cliente.setNome(inpt.nextLine());
        System.out.println("informe cpg:");
        cliente.setCpf(inpt.nextLine());

        System.out.println("Adicionar Cartao? 1(SIM) 0(NAO)");
        int x = inpt.nextInt();
        if (x == 1) {
            while (x == 1) {
                this.addCard(cliente);
                System.out.println("Adicionar Cartao? 1(SIM) 0(NAO)");
            }
        }
        System.out.println("Cadastro completo");

    }

}
