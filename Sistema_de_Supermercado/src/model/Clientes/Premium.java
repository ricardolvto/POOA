package model.Clientes;

 class Premium extends Cliente{
	int desconto;
	float mensalidade;
	
	Premium(int d, int m){
		this.desconto = d;
		this.mensalidade = m;
	}

}
