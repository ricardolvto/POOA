package teste;

import controllers.ControllerClienteBasico;
import model.*;
import model.cliente.IBasic;
import model.cliente.ICliente;
public class Caso2 {

	public static void main(String[] args) {
		ControllerClienteBasico ControlCliente = new ControllerClienteBasico();
		IBasic InterfaceCliente;

		InterfaceCliente = ControlCliente.CriaCliente();

		ControlCliente.CadastroCliente(InterfaceCliente);

		System.out.println(InterfaceCliente.getCpf());
		System.out.println(InterfaceCliente.getNome());
		System.out.println(InterfaceCliente.getCartaoList());
		System.out.println(InterfaceCliente.getPontos());


		
		
	}

}
