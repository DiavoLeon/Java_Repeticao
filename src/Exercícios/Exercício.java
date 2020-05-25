package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int x = 0;
		
		for(int i = 1; i <= 15; i++) {
			System.out.println("Digite o "+i+"º Número");
			int y = leitor.nextInt();
			
			x = (y > x) ? y : x;
        }
        
        System.out.print("O maior valor digitado foi "+x);			
		}

	}

