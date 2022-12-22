package br.uern.di.poo.unidade1.construcao;

public class Porta {
    private tipoporta tipo;
    private double alt, larg;
    private int piv;
    private final double taxa = 350.00;
    private final double largp = 0.7;
    private final double altp = 1.8;

    public Porta() {
        this.tipo = tipoporta.portasimples;
        this.alt = altp;
        this.larg = largp;
        this.piv = -1;
    }

    public Porta(tipoporta tipo, double alt, double larg, int piv) {
        this.tipo = tipo;
        this.alt = alt;
        this.larg = larg;
        this.piv = piv;
    }

    public tipoporta getTipo() {
        return tipo;
    }

    public void setTipo(tipoporta tipo) {
        this.tipo = tipo;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    public int getPiv() {
        return piv;
    }

    public void setPiv(int piv) {
        this.piv = piv;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getLargp() {
        return largp;
    }

    public double getAltp() {
        return altp;
    }

    public double calculaPreco(Porta portas) {
        double custo = 0.0;
        if(portas.tipo == tipoporta.portasimples && piv == 1){
            custo = portas.tipo.getValor() + taxa;
            return custo;
        }
        else if(portas.tipo == tipoporta.portapadrao && piv == 1){
            custo = portas.tipo.getValor() + taxa;
            return custo;
        }
        else if(portas.tipo == tipoporta.portaluxo && piv == 1){
            custo = portas.tipo.getValor() + taxa;
            return custo;
        }
        else if(portas.tipo == tipoporta.portapadrao && piv == -1){
            custo = portas.tipo.getValor();
            return custo;
        }
        else if(portas.tipo == tipoporta.portasimples && piv == -1){
            custo = portas.tipo.getValor();
            return custo;
        }
        else if(portas.tipo == tipoporta.portaluxo && piv == -1){
            custo = portas.tipo.getValor();
            return custo;
        }
        return 0;
    }
    
    public static void exibePorta(Porta ePorta) {
        System.out.println("Madeira = " + ePorta.tipo.getMadeira());
        System.out.println("Fechadura = " + ePorta.tipo.getFechadura());
        System.out.println("Altura = " + ePorta.getAlt());
        System.out.println("Largura = " + ePorta.getLarg());
        if (ePorta.getPiv() == 1)
            System.out.println("Pivotante = sim");
        else if (ePorta.getPiv() == -1) 
            System.out.println("Pivotante = não");

        System.out.printf("Preço = %.2f", ePorta.calculaPreco(ePorta));
        System.out.println(" ");
        System.out.printf("Valor da instalação = %.2f", calcularserv.servinst(ePorta));
        System.out.println(" ");
        System.out.println("|----------------------------------------------|");
    }
}
