package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		int x = 0;
		
		System.out.println("Digite um N�mero: ");
		x = leitor.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println(i);
		}
		
		System.out.println("FIM DO LOOP");
	}
}
