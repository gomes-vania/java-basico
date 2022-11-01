package aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroDigitado, soma = 0;
		boolean valorValido = true;
		
		do {
			
			System.out.println("Digite um número: ");
			numeroDigitado = leia.nextInt();
			
			if (numeroDigitado > 0)
				soma += numeroDigitado;
			
			if (numeroDigitado == 0) 
				valorValido = false;
			
		}
		
		while (valorValido == true);
		System.out.println("A soma dos números positivos é: "+ soma);
		
					
		}
	
		
	}

		
		
		

