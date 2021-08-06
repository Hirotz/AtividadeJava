package br.com.generation.exercicios.aula04;

import java.util.Scanner;

public class Exercicio3NM {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		int l, c;
		
		for(l = 0; l < 4; l++) {
			
			for(c = 0; c < 6; c++) {
				
				System.out.println("Digite o número para N1: ");
				n1[l][c] = ler.nextInt();
				
				
				System.out.println("Digite o número para N2: ");
				n2[l][c] = ler.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];	
				}
		   }
			for(l = 0; l < 4; l++) {
				for(c = 0; c < 6; c++) {
					
					System.out.println("Matrix M1: " + m1[l][c]);
					System.out.println("\nMatrix M2: " + m2[l][c]);
				}
			}
	
	}

}
