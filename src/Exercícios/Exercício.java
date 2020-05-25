package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int x, contagem = 1;
		int maior = 0;	
		
		for(int i = 1; i <= 15; i++) {
			
			System.out.println("Digite o "+i+"º Número: ");
		}
		do {
			System.out.printf("%d° número: ", contagem);
			x = leitor.nextInt();
			contagem++;
			if (x > maior) {
				maior = x;
			}
		}
		while (contagem <= 15);
		System.out.printf("O Número é: "+maior);
	}
}
