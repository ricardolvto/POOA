package model.cliente;

class Premium extends Cliente {
    private static float desconto;
    private static float mensalidade;
    
    public static float getDesconto() {
        return desconto;
    }
    public static void setDesconto(float desconto) {
        Premium.desconto = desconto;
    }
    public static float getMensalidade() {
        return mensalidade;
    }
    public static void setMensalidade(float mensalidade) {
        Premium.mensalidade = mensalidade;
    }
}


