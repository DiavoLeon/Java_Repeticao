package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		for (int i = 1; i < 11; i++) {
			
			int x = 0;
			
			System.out.println("Digite o "+i+"� N�mero: ");
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
