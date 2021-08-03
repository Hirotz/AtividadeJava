package AnosEmDias;

import java.lang.Math;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, r, s, p, p2;
		
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextInt();
		
		r = a+b;
		p = r*r;
		s = b+c;
		p2 = s*s;
		d = (p+p2) / 2;
		
		System.out.println("O resultado da conta é: " + d);
		
		entrada.close();
		
		
		
	}

}
