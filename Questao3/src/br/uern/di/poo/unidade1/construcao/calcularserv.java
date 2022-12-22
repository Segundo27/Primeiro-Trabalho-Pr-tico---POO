package br.uern.di.poo.unidade1.construcao;

public class calcularserv {
    private final static double percentual = 0.1;
    private final static double instalacao = 70.00;
    private final static double instalacaopiv = 250.00;
    
    public static double servinst(Porta port) {
        double valorserv = 0.0;
        double metroquadrado = port.getAlt()*port.getLarg();

        if(port.getTipo() == tipoporta.portasimples){
            valorserv = metroquadrado*instalacao;
            if(port.getPiv() == 1){
                valorserv += instalacaopiv;
                return valorserv;
            }
            else 
                return valorserv;
        }
        else if(port.getTipo() == tipoporta.portapadrao){
            valorserv = metroquadrado*instalacao;
            if(port.getPiv() == 1){
                valorserv += instalacaopiv;
                return valorserv;
            }
            else 
                return valorserv;
        }
        else if(port.getTipo() == tipoporta.portaluxo){
            valorserv = metroquadrado*instalacao;
            if(port.getPiv() == 1){
                valorserv += instalacaopiv;  
                valorserv = valorserv +(valorserv*percentual/100);
                return valorserv;
            }
            else 
            valorserv = valorserv +(valorserv*percentual/100);
                return valorserv;
        }
        return 0;

    }
}
