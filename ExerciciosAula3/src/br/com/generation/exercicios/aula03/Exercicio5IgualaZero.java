package br.com.generation.exercicios.aula03;

import java.util.Scanner;

public class Exercicio5IgualaZero {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma =0;
		
		 do{
			 System.out.println("Digite um n�mero: ");
			 numero = leia.nextInt();
		
			 soma = soma + numero;
		 }
		 while ( numero != 0);
		 
		 System.out.println("A soma de todos os n�meros �: " + soma);
		 
		 leia.close();
		
		
		

	}

}
