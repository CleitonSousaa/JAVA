package VT;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
		//int[] vetorInteiros;
		int[] vetorInteiros = new int[5];
		
		int[] vetor = {1, 2, 3, 4, 5};

		
		int primeiroElemento = vetor[0];
		int segundoElemento = vetor[1];
		
		for (int i = 0; i < vetor.length; i++) {
		    System.out.println(vetor[i]);
		}

		String[] nomes = {"Alice", "Bob", "Charlie"};

		double[] numerosReais = {1.5, 2.0, 3.7};



		int[] Novovetor = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
		Arrays.sort(vetor);

		int indice = Arrays.binarySearch(vetor, 5);

		int[] copia = Arrays.copyOf(vetor, vetor.length);



	}

}
