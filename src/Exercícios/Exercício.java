package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		double x, salario = 0;
		double alturaA = 0 , alturaB = 0; 
		int sexo; 
		int mulher = 0;
		
		
		for(int i = 1; i <= 20; i++) {
			
			System.out.println("Digite a  Altura do "+i+"� Funcion�rio: ");
			x = leitor.nextFloat();
			
			if(x > alturaA) {
				alturaA = x;
			}
			else if(x < alturaB) {
				alturaB = x;
			}	
			
			do {
				
				System.out.println("Digite o Sexo do Funcion�rio: Digite 1 para Feminino e 2 para Masculino ");
				sexo = leitor.nextInt();
								
			} while(!(sexo == 1 || sexo == 2));
			
			
			System.out.println("Digite o Sal�rio do Funcion�rio: ");
			
			double dinheiro = leitor.nextFloat();
			
			if(dinheiro > 1000 && sexo == 2) {
				mulher++;
			}
			salario += dinheiro;
	    }
		System.out.println("A M�dia de Sal�rio Entre Os Funcion�rios �: "+salario / 20);
		System.out.println("A Maior Altura Entre Os Funcion�rios �: " +alturaA);
		System.out.println("A Menor Altura Entre Os Funcion�rios �: " +alturaB);
		System.out.println("A Quantidade de Mulheres na Empresa Que Recebem R$1000,00 �: "+mulher);
    }
}

