package aula01;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int salario, abono;
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextInt();
		System.out.println("Digite o abono: ");
		abono= leia.nextInt();
		
		System.out.println("Seu novo salário é: " + (salario + abono));
		
	}

}
