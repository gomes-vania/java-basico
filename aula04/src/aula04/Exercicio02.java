package aula04;

import java.util.Scanner;

public class Exercicio02 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int i;
		
		
		for (i = 0; i < vetor.length; i++) {
			System.out.println("Ïnsira um valor no vetor: ");
			System.out.println(i);
			vetor[i] = leia.nextInt();
		}
		
		System.out.println(vetor.length);
	}

}
