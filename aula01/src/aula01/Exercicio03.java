package aula01;

import java.util.Scanner;

public class Exercicio03 {
	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite suas horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite o desconto que você teve do salário: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu salário líquido é de R$: " + salarioLiquido);
	}

}
