package TT;

public class TestarTiposPrimitivos {
	public static void main(String[] args) {
		
		//converter inteiro para string
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.println(valor);
		
		//converter string para inteiro
		String valor1 = "32";
		int idade1 = Integer.parseInt(valor1);
		System.out.println(idade1);
		
		
		//converter string para inteiro
		String valor2 = "35";
		float idade2 = Float.parseFloat(valor2);
		System.out.println(idade2);
				
		
	}
}
