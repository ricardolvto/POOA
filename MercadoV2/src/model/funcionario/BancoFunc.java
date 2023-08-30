// singleton, logo nao pode ter Interface
package model.funcionario;

import java.util.Vector;

public class BancoFunc {
	Vector<Funcionario> listaFunc;
	private static BancoFunc instancia = null;
	
	BancoFunc(){};
	
	public static BancoFunc getInstancia() {
        if (instancia == null) {
        	instancia = new BancoFunc();
        }
        return instancia;
    }

	public void addFunc(int code, String nome, int cargo, String endereco) {
		if(this.listaFunc == null) {this.listaFunc = new Vector<>();}
		iFuncFactory func = new iFuncFactory();
		Funcionario funcionario = func.getFuncionario(code, nome, cargo, endereco);
		this.listaFunc.add(funcionario);
	}
	

	public double getSalFuncs() {
		double total = 0;
		if(this.listaFunc != null) {
			for (Funcionario auxFunc : this.listaFunc) {
	            total += auxFunc.getSalario();
			}
		}
	    return total;
	}


	public void printFuncionarios() {
		for (Funcionario auxFunc : this.listaFunc) {
            System.out.print("\n|------------------------------------------------------------");
            System.out.print("\n|Nome: " + auxFunc.getNome());
            System.out.print("\n|Cargo: " + auxFunc.getCargo());
            System.out.print("\n|Salario: " + auxFunc.getSalario());
		}
	}

	public boolean printFuncionario(int cpf) {
		if(this.listaFunc!=null) {
			for (Funcionario auxFunc : this.listaFunc) {
					if(auxFunc.getCPF() == cpf) {
		            System.out.print("\n|------------------------------------------------------------");
		            System.out.print("\n|Nome: " + auxFunc.getNome());
		            System.out.print("\n|Cargo: " + auxFunc.getCargo());
		            System.out.print("\n|Salario: " + auxFunc.getSalario());
		            return true;
	            }
			}
		}
		return false;
	}
}
