package model.compra;

import java.util.Scanner;

import model.funcionario.*;

public class CaixaFisico {
	    private boolean aberto;
	    private float balanco;
	    private int nun_caixa;

	    public CaixaFisico() {};
	    public boolean cadastrar_entrada()
	    {
		    Scanner ler = new Scanner(System.in);
		    int a; boolean b = false;
		    BancoFunc bf = BancoFunc.getInstancia();
		    
		    while(!b){
				System.out.println("Por favor informe seu ID:");
				a = ler.nextInt();
		    	if(bf.printFuncionario(a)) {
		    		return true;
		    	}
		    	System.out.println("O funcionário não existe!");
	    	}
	        return true;
	    }

	    public boolean cadastrar_saida()
	    {
	    	System.out.println("Operador saiu com sucesso...");
	        return true;
	    
	    }

	    public boolean isAberto() {
	        return aberto;
	    }
	    public void setAberto(boolean aberto) {
	        this.aberto = aberto;
	    }
	    public float getBalanco() {
	        return balanco;
	    }
	    public void setBalanco(float balanco) {
	        this.balanco = balanco;
	    }
	    public int getNun_caixa() {
	        return nun_caixa;
	    }
	    public void setNun_caixa(int nun_caixa) {
	        this.nun_caixa = nun_caixa;
	    }

}
