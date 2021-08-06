package br.com.generation.exercicios.aula04;

import java.util.Scanner;

public class Exercicio1MaiorNumero {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double[] pontuacao = new double [5];
		
	    double maior = 0.0;
		
		System.out.println("Digite as pontuações: ");
		
		for(int i = 0; i <=4; i++){
			pontuacao[i] = ler.nextDouble();
			
			if(pontuacao[i] > maior) {
				maior = pontuacao[i];
				
			}
		}
		
		System.out.println("A maior pontuação é: " + maior);
		
		ler.close();
		}
	}
	


