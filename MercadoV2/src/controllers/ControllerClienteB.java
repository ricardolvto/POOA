package controllers;

import model.cliente.*;
import model.pagamento.Pagamento;

public class ControllerClienteB extends ControllerCliente {

    @Override
    public IBasic CriaCliente() {
        CliBasicoFactory factory = new CliBasicoFactory();
        return factory.criaCliente();
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
        cliente.setPontos(0);
        System.out.println("Cadastro completo");

    }

    public IPremium AssinarPlano(IBasic cliente)
    {
        CliPremiumFactory factory = new CliPremiumFactory();
        IPremium cliPremium = factory.criaCliente(cliente);
        return cliPremium;
    }

    

}
