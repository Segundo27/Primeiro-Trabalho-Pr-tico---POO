package br.uern.di.poo.unidade1.construcao;

public class constru {
    public static void main(String[] args) {
        Porta porta1 = new Porta(tipoporta.portasimples, 1.8, 0.8, -1);
        Porta porta2 = new Porta(tipoporta.portapadrao, 1.9, 0.9, -1);
        Porta porta3 = new Porta(tipoporta.portaluxo, 2.0, 1.0, -1);
        Porta porta4 = new Porta(tipoporta.portaluxo, 2.0, 1.0, 1);

        Porta.exibePorta(porta1);
        Porta.exibePorta(porta2);
        Porta.exibePorta(porta3);
        Porta.exibePorta(porta4);
    }
}
