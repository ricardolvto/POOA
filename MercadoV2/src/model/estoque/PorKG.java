package model.estoque;

public class PorKG extends Item {
	double qnt;
	
	public PorKG() {
		// TODO Auto-generated constructor stub
	}

	public PorKG(String code, String nome, String descricao, String fornecedor, iTipo tipo, double d, double qnt) {
		super(code, nome, descricao, fornecedor, tipo, d);
		this.qnt = qnt;
	}
	
	@Override
	public double addQnt(double qnt) {
		this.qnt += qnt;
		return this.qnt;
	}

	@Override
	public double getQnt() {
		return this.qnt;
	}
}
