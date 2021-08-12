package br.com.generation.exercicio.aula08;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		
		String estoque1 ="Camisetas";
		String estoque2 ="Calças";
		String estoque3 ="Bermudas";
		String estoque4 ="Blusas";
		String estoque5 ="Bonés";
		
		ArrayList<String> estoques = new ArrayList<>();
		
		estoques.add(estoque1);
		estoques.add(estoque2);
		estoques.add(estoque3);
		estoques.add(estoque4);
		
		
		System.out.println(estoques);
		
	
		estoques.add(estoque5);
		System.out.println(estoques);
		estoques.remove(1);
		
		for(int i =0; i < estoques.size(); i++) {
			System.out.println("Estoque: " + estoques.get(i));
		}
		
		
	}

}
