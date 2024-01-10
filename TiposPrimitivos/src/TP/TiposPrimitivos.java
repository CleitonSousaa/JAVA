package TP;

import java.util.Scanner;



/**
 * comentario para docs
 * @author CleitonSousa 
 */

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
		
		String nome = "Gustavo";
		float nota =  8.5f;
		
		// print comum
		System.out.print("pula: A nota de "+ nome +" é " + nota);
		
		//print pula uma linha apos imprimir
		System.out.println("pula: A nota de "+ nome +" é " + nota);
		
		//print formatado
		System.out.printf("formatado: A nota de %s é %.4f", nome, nota);
		
		//outra maneira formatado
		System.out.format("formatado: A nota de %s é %.2f", nome, nota);
		
		System.out.println("------------------------");
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();


        double soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
		
	
	}

}
