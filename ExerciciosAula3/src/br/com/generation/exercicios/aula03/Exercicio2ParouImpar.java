package br.com.generation.exercicios.aula03;
import java.util.Scanner;
public class Exercicio2ParouImpar {

	public static void main(String[] args) {
		
		
	Scanner leia = new Scanner(System.in);
		
	int numero; 
	
	System.out.println("Digite um n�mero: ");
	numero = leia.nextInt();
	
	if(numero % 2 !=0 ) {
		System.out.println("N�mero Impar");
	}
	else {System.out.println("N�mero Par");}
		
	leia.close();
	}

	
}
