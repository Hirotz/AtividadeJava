package AnosEmDias;

import java.util.Scanner;

public class anosemdias {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int ano, meses, dia, dias;
		
		System.out.println("Digite a idade em dias: ");
		dias = entrada.nextInt();
		
		ano = dias / 365;
		meses = (dias % 365) / 30;
		dia = (dias % 365) / 30; 
		
		System.out.println("A idade em Anos é: " + ano);
		System.out.println("A idade em Meses é: " +meses);
		System.out.println("A idade em Dias é: " + dia);
		
		entrada.close();
	}

}
