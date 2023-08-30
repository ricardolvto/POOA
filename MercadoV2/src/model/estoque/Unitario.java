package model.estoque;

class Unitario extends Item {
	int qnt;

	public Unitario() {
		// TODO Auto-generated constructor stub
	}

	public Unitario(String code, String nome, String descricao, String fornecedor, iTipo tipo, double d, int qnt) {
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
