package EC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        float n1, n2, m;
        
        try {
            System.out.println("Digite a primeira nota: ");
            n1 = teclado.nextFloat();
            System.out.println("Digite a segunda nota: ");
            n2 = teclado.nextFloat();            
        } catch (InputMismatchException e) {
            System.out.println("Por favor, insira valores numéricos válidos.");
            teclado.close();
            return;
        }

        m = (n1 + n2) / 2;
        
        System.out.println("Sua média foi: " + String.format("%.1f", m));
        
        if (m > 6) {
            System.out.println("Aprovado, Parabéns");
        } else {
            System.out.println("Reprovado, Estude mais !");
        }

        teclado.close();
    }
}
