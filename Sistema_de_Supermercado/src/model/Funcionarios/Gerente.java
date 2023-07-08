package model.Funcionarios;

import java.util.Vector;

public class Gerente extends Funcionario{
	Vector<String> areasResponsavel;

	Gerente(String nome, int CPF, int t, int ht, String iB, String aR) {
		super(nome, CPF, t, ht, iB);
		// TODO Auto-generated constructor stub
		this.areasResponsavel = new Vector<>();
		this.areasResponsavel.add(aR);
	}

}
