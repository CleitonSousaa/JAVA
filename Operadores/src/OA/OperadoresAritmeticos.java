package OA;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 5;
		float m = (n1 + n2) / 2;
		int numeroIncremento = 5;
		int numeroDecremento = 5;
		int valor;
		int x = 4;
		float raizQuadrada;
		
		
		
		numeroIncremento++;
		numeroDecremento--;
		valor = 5 + numeroIncremento++;
		x += 2; // += -= *= /= %=
		raizQuadrada = (float) Math.sqrt(25); 
		
		System.out.println("A média é igual a " + m);
		System.out.println("Número incrementado é: " + numeroIncremento);
		System.out.println("Número decrementado é: " + numeroDecremento);
		System.out.println("Valor é: " + valor);
		System.out.println("X é: " + x);
		System.out.println("Raiz Quadrada é: " + raizQuadrada);

	}

}
