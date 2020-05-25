package Exercícios;

import java.util.Scanner;

public class Exercício {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		double x, salario = 0;
		double alturaA = 0 , alturaB = 0; 
		int sexo; 
		int mulher = 0;
		
		
		for(int i = 1; i <= 20; i++) {
			
			System.out.println("Digite a  Altura do "+i+"º Funcionário: ");
			x = leitor.nextFloat();
			
			if(x > alturaA) {
				alturaA = x;
			}
			else if(x < alturaB) {
				alturaB = x;
			}	
			
			do {
				
				System.out.println("Digite o Sexo do Funcionário: Digite 1 para Feminino e 2 para Masculino ");
				sexo = leitor.nextInt();
								
			} while(!(sexo == 1 || sexo == 2));
			
			
			System.out.println("Digite o Salário do Funcionário: ");
			
			double dinheiro = leitor.nextFloat();
			
			if(dinheiro > 1000 && sexo == 2) {
				mulher++;
			}
			salario += dinheiro;
	    }
		System.out.println("A Média de Salário Entre Os Funcionários É: "+salario / 20);
		System.out.println("A Maior Altura Entre Os Funcionários É: " +alturaA);
		System.out.println("A Menor Altura Entre Os Funcionários É: " +alturaB);
		System.out.println("A Quantidade de Mulheres na Empresa Que Recebem R$1000,00 É: "+mulher);
    }
}

