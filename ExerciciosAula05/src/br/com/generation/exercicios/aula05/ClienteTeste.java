package br.com.generation.exercicios.aula05;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		 cliente1.nome = "Mario";
		 cliente1.endereco = "Rua dos Cogumelos";
		 cliente1.email = "mario@gmail.com";
		 cliente1.idade = 45;
		 cliente1.telefone = 55443321;
		
		 
		System.out.println("===== Cadastro ===== ");
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("Endereço: " + cliente1.endereco);
		System.out.println("Email: " + cliente1.email);
		System.out.println("Idade: " + cliente1.idade);
		System.out.println("Telefone: " + cliente1.telefone);
		
		System.out.println();
		System.out.println("=== Status da encomenda ===" );
		
		cliente1.compras();
		
		cliente1.entrega();
		
		
		
		
		
	}

}
