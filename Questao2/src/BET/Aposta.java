package BET;

public class Aposta {
  private Evento nome;
  private Resultado fim;
  private double dinheiro;

public Aposta(Evento nome, Resultado fim, double dinheiro) {
    this.nome = nome;
    this.fim = fim;
    this.dinheiro = dinheiro;
}

public Evento getNome() {
    return nome;
}

public void setNome(Evento nome) {
    this.nome = nome;
}

public Resultado getFim() {
    return fim;
}

public void setFim(Resultado fim) {
    this.fim = fim;
}

public double getDinheiro() {
    return dinheiro;
}

public void setDinheiro(double dinheiro) {
    this.dinheiro = dinheiro;
}

public double calculaLucro(Evento nome) {
    double valorlucro;
    if(nome.getFim() == Resultado.time1){
        valorlucro = (dinheiro*nome.getOdd1())-dinheiro;
        return valorlucro;
    }
    else if(nome.getFim() == Resultado.empate){
        valorlucro = dinheiro*nome.getOdd2()-dinheiro;
        return valorlucro;
    }
    else {
        valorlucro = dinheiro*nome.getOdd3()-dinheiro;
        return valorlucro;
    }

}
}
 
