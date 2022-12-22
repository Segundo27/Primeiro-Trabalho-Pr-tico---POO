package datahora;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class horadata {
	
		  public static void main(String[] args) throws ParseException {
			
			String datad;
		
			SimpleDateFormat formatov = new SimpleDateFormat ("MM/dd/yyyy");


			System.out.println("\n Escreva uma data no formato MM/dd/yyyy: ");
			Scanner entrada = new Scanner(System.in);
			datad = entrada.next();
			Date datah = formatov.parse(datad);

			SimpleDateFormat formato = new SimpleDateFormat("\n MMMM dd,yyyy");
			String data = formato.format(datah);

			System.out.println(data);		

			}
		  }
		