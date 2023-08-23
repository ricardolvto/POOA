package model.cliente;

import java.util.Vector;

public class BancoClientes {
    Vector<Cliente> listaCli;
	private static BancoClientes instancia = null;

    public static BancoClientes getInstancia() {
        if (instancia == null) {
        	instancia = new BancoClientes();
        }
        return instancia;
    }


    public void addCliBasico(Basic cliente) {
		if(this.listaCli == null) {this.listaCli = new Vector<>();}
        for(Cliente cli : this.listaCli)
        {
            if(cli.getCpf().equals(cliente.getCpf()))  
            {  
            System.out.println("usuario ja existe");
            return;
            }
        }
        this.listaCli.add(cliente);
	}

    public void addCliPremium(Premium cliente) {
		if(this.listaCli == null) {this.listaCli = new Vector<>();}
        for(Cliente cli : this.listaCli)
        {
            if(cli.getCpf().equals(cliente.getCpf()))  
            {  
            System.out.println("usuario ja existe");
            return;
            }
        }
        this.listaCli.add(cliente);
	}

}
