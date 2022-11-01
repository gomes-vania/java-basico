package aula03;

import java.util.Scanner;

public class Exercicio01 {

		public static Scanner leia = new Scanner(System.in);

		public static void main(String[] args) {
			
			int numero, contador, par = 0, impar =0;
			
			for (contador = 1; contador <= 10; contador ++) {
				
				System.out.println("Digite o " + contador + "º número: ");
				numero = leia.nextInt();
				
				if (numero % 2 == 0) {
					par ++;
				} else {
					impar ++;
				}
				
			}
			
			System.out.println("Total de números pares: " + par);
			System.out.println("Total de números ímpares: " + impar);

		}
	}


