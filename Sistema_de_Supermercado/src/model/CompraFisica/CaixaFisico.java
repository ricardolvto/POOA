package model.CompraFisica;

import java.util.Vector;
import model.Funcionarios.OperadorCaixa;
import model.Compra.ListaCompra;

public class CaixaFisico {
	boolean operando;
	float lucroCaixa;
	Vector<OperadorCaixa> operador;
	Vector<ListaCompra> historico;
	
	boolean swithCaixa() {
		if(this.operando == false) {
			this.operando = true;
			return true;
		}else
			this.operando = false;
		return false;
	}
	
	Vector<ListaCompra> getHistorico(){
		return this.historico;
	}
	
	Vector<OperadorCaixa> getOperadores(){
		return this.operador;
	}

	float lucroCaixa(){
		float lucro=0;
		for(ListaCompra lista:this.historico) {
			lucro += lista.getLucro();
		}
		return lucro;
	}
}
