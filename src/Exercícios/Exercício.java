package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		long x = 0;
						
		for (int i = 1; i <= 20; i++) {
			
			System.out.println("Digite o "+i+"º Número: ");
			x += leitor.nextInt();
	}
		
		System.out.println("A Soma dos Valores é: "+ x);
		System.out.println("A Média dos Valores é: "+ x / 20);
	}
}
