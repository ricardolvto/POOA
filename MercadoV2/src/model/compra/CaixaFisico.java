package model.compra;


public class CaixaFisico {
	    private boolean aberto;
	    private float balanco;
	    private int nun_caixa;

	    public CaixaFisico() {};
	    public boolean cadastrar_entrada(Long code)
	    {
	    	System.out.println("Operador " + code + " entrou com sucesso...");
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
