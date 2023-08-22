package model.compra;

public interface iVenda {
	public void iniciaVenda();
	
	public void adicionaProduto(String code, int qnt);
	public boolean updateEstoque();
	public void iniciaPagamento();
	public void printaProdutos();

}
