package BET;

public class Evento {
   private String nome; 
   private String time1, time2;
   private double odd1, odd2, odd3;
   private Resultado fim;

public Evento(String nome, String time1, String time2, double odd1, double odd2, double odd3) {
    this.nome = nome;
    this.time1 = time1;
    this.time2 = time2;
    this.odd1 = odd1;
    this.odd2 = odd2;
    this.odd3 = odd3;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getTime1() {
    return time1;
}

public void setTime1(String time1) {
    this.time1 = time1;
}

public String getTime2() {
    return time2;
}

public void setTime2(String time2) {
    this.time2 = time2;
}

public double getOdd1() {
    return odd1;
}

public void setOdd1(double odd1) {
    this.odd1 = odd1;
}

public double getOdd2() {
    return odd2;
}

public void setOdd2(double odd2) {
    this.odd2 = odd2;
}

public double getOdd3() {
    return odd3;
}

public void setOdd3(double odd3) {
    this.odd3 = odd3;
}

public Resultado getFim() {
    return fim;
}

public void setFim(Resultado fim) {
    this.fim = fim;
}

}

