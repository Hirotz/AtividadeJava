package br.com.generation.exercicio.aula06;

public class MostraAnimal {

	public static void main(String[] args) {
		
		TesteAnimal bicho = new TesteAnimal();
		
		Cachorro dog = new Cachorro();
		
		Cavalo horse = new Cavalo();
		
		Preguica sid = new Preguica();
		
		dog.setNome("Snoopy");
		dog.setIdade(7);
		horse.setNome("P� de pano");
		horse.setIdade(9);
		sid.setNome("Sid");
		sid.setIdade(15);
		
		
		System.out.println("O nome do cachorro �: " + dog.getNome());
		bicho.somAnimal(new Cachorro());
		
		System.out.println("A idade do cachorro �: " + dog.getIdade());
		
		System.out.println("Para fazer o cachorro correr, voc� diz: ");
		bicho.correr(new Cachorro());
		
		System.out.println();
		
		System.out.println("O nome do cavalo �: " + horse.getNome());
		bicho.somAnimal(new Cavalo());
		
		System.out.println("A idade do cavalo �: " + horse.getIdade());
		
		System.out.println("Para fazer o cavalo correr, voc� diz: ");
		bicho.correr(new Cavalo());
		
		System.out.println();
		
		System.out.println("O nome da pregui�a �: " + sid.getNome());
		bicho.somAnimal(new Preguica());
		
		System.out.println("A idade da pregui�a �: " + sid.getIdade());
		
		System.out.println("Quando ele est� cansado e quer dormir, sabe o que ele faz? ");
		bicho.subir(new Preguica());
	}
	

}

