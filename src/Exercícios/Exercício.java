package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x = 0;
		
		System.out.println("Digite um Número: ");
		x = leitor.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
		
		System.out.println("FIM DO LOOP");
	}
}
