package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		long x = 0;
						
		for (int i = 1; i <= 20; i++) {
			
			System.out.println("Digite o "+i+"� N�mero: ");
			x += leitor.nextInt();
	}
		
		System.out.println("A Soma dos Valores �: "+ x);
		System.out.println("A M�dia dos Valores �: "+ x / 20);
	}
}
