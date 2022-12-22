package BET;
public class UERNBet {

    public static void main(String args[]){
   	 Evento quartasFinal1 = new Evento ("Quartas de final da copa do mundo",
   		 "Brasil", "Croácia", 1.18, 1.8, 2.5);
   	 Evento quartasFinal2 = new Evento ("Quartas de final da copa do mundo",
   		 "Argentina", "Holanda", 1.4, 1.5, 1.9);
   	 
   	 Aposta aposta1 = new Aposta(quartasFinal1, Resultado.time1, 1000);
   	 Aposta aposta2 = new Aposta(quartasFinal1, Resultado.empate, 400);
   	 Aposta aposta3 = new Aposta(quartasFinal1, Resultado.time2, 300);
   	 
   	 quartasFinal1.setFim(Resultado.empate);
   	 
   	 if(aposta1.getFim() == quartasFinal1.getFim()){
		System.out.println("Resultados da Partida 1:\n");
   		 System.out.println("O apostador ganhou R$ " +
   			 aposta1.calculaLucro(quartasFinal1));}
   	 else{
		System.out.println("Resultados da Partida 1:\n");
   		 System.out.println("O apostador perdeu R$ " + 
                     aposta1.getDinheiro());}

	quartasFinal2.setFim(Resultado.time1);
   	 
   	 if(aposta1.getFim() == quartasFinal2.getFim()){
		System.out.println("\nResultados da Partida 2:\n");
   		 System.out.println("O apostador ganhou R$ " +
   			 aposta1.calculaLucro(quartasFinal2));}
   	 else{
		System.out.println("Resultados da Partida 2:\n");
   		 System.out.println("O apostador perdeu R$ " + 
                     aposta1.getDinheiro());
		System.out.println("\n \n");
    }
}
}