package model.Clientes;

 class Basico extends Cliente{
	public Basico(String nome, int cPF, int pontos, String endereco, String email, String senha) {
		// TODO Auto-generated constructor stub
	}

	Cliente mudarParaPremium() {
		return ClienteFactory.criarCliente("Premium", "Ciclano", 987654321, 200, "Endereço", "ciclano@example.com", "senha");
	}
}
