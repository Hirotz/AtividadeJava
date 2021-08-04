package br.com.generation.exerciciosaula2;

import java.util.Scanner;

public class exercicio3SistemaIdade {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Pertence ao Infantil A");
		}
		else if(idade >= 8 && idade <=11) {
			System.out.println("Pertence ao Infantil B");
		}
		else if(idade >= 12 && idade <=13) {
			System.out.println("Pertence ao Juvenil A");
		}
		else if(idade >= 14 && idade <= 17) {
			System.out.println("Pertence ao Juvenil B");
		}
		else {System.out.println("Pertence a categoria Adulta");}
		
		leia.close();		
		
		
		
		
		
		
	}

}
