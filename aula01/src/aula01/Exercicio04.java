package aula01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3, numero4, diferenca;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		System.out.println("Digite o quarto número: ");
		numero4 = leia.nextInt();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("Diferença entre o produto dos números é: " + diferenca); ;

		
		

	}

}
