package br.uern.di.poo.unidade1.construcao;

public enum tipoporta {
    portasimples("Madeira Compensada", "Fechadura Simples", 50.00),
    portapadrao("Madeira Andiroba", "Fechadura de Encaixe", 140.00),
    portaluxo("Madeira Ipê", "Fechadura tetra", 350.00);
    
    private final String madeira;
    private final String fechadura;
    private final double valor;

    private tipoporta(String madeira, String fechadura, double valor) {
        this.madeira = madeira;
        this.fechadura = fechadura;
        this.valor = valor;
    }

    public String getMadeira() {
        return madeira;
    }

    public String getFechadura() {
        return fechadura;
    }

    public double getValor() {
        return valor;
    }

}
