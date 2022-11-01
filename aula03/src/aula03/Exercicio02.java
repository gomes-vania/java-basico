package aula03;

import java.util.Scanner;

public class Exercicio02 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade = 0, idadeValida = 0, contadorMenor = 0, contadorMaior = 0;
		
		while (idadeValida >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();	
			
			if (idade < 0) {
				System.out.println("Idade inválida!");
				break;
			}
			
			if (idade <= 21)
				contadorMenor ++;
			
			if (idade >= 50)
				contadorMaior++;
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + contadorMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + contadorMaior);
}
		
	
}
