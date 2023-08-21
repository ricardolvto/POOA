package controllers;

import java.util.Scanner;

import model.cliente.*;
import model.compra.*;
import model.estoque.*;

public class ControllerClienteBasico {

	Scanner inpt = new Scanner(System.in);

	public IBasic CriaCliente() {
		CliBasicoFactory factory = new CliBasicoFactory();
		return factory.criaCliente();
	}

	public void CadastroCliente(IBasic cliente) {
		cliente.setPontos(0);
		System.out.println("informe o cpf");
		String cpf = inpt.nextLine();
		cliente.setCpf(cpf);
		System.out.println("informe o nome");
		String nome = inpt.nextLine();
		cliente.setNome(nome);
		System.out.println("inserir cartao? 1(sim) 0(nao)");
		int x = inpt.nextInt();
		if (x == 0) {
			System.out.println("cadastro concluido");
		}/*  else {
			while (x == 1) {
				System.out.println("informe o numero do cartao");
				String numero = inpt.nextLine();
				cliente.
				System.out.println("informe o nome");
				String nome = inpt.nextLine();
				cliente.setCpf(nome);
				System.out.println("inserir cartao? 1(sim) 0(nao)");
				int x = inpt.nextInt();
			}
		}*/

	}

}
