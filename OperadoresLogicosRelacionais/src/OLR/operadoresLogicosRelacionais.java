package OLR;

public class operadoresLogicosRelacionais {

	public static void main(String[] args) {
		
		// Declaração das variavel
		int n1, n2, r;
		String txt1, txt2, txt3, res, res2, res3;
		int x, y, z;
		boolean a, b, c, d;
		
		
		// Atribuição dos valores
		n1 = 14;
		n2 = 8;
		txt1 = "Gustavo";
		txt2 = "Gustavo";
		txt3 = new String("Gustavo");
		x = 4;
		y = 7;
		z = 12;
		
		
		
		
		// Comparações 
		r = (n1 > n2) ? 0 : 1; // se(?)==true = 0, senao(:)==false = 1
		res = (txt1 == txt2) ? "igual" : "diferente";
		res2 = (txt1 == txt3) ? "igual" : "diferente";
		res3 = (txt1.equals(txt3)) ? "igual" : "diferente";
		a = (x<y && y<z) ? true : false; 
		b = (x<y || y<z) ? true : false;
		c = (x<y ^ y<z) ? true : false;
		d = (x<y != y<z) ? true : false;
		
			
		// Impresão dos Resultados
		System.out.println(r);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
