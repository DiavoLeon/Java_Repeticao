package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		for (int i = 1; i < 11; i++) {
			
			int x = 0;
			
			System.out.println("Digite o "+i+"º Número: ");
			x = leitor.nextInt();
			
			if (x > 0) {
				System.out.println("POSITIVO");
					
			}
			else if (x < 0) {
				System.out.println("NEGATIVO");
			}
			else {
				System.out.println("NEUTRO");
			}
		}
		System.out.println("FIM DO LOOP");
	}
}
