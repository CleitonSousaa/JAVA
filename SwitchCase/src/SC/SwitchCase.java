package SC;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ser imaginário (saci, centauro, etc.): ");
        String serImaginario = scanner.nextLine();

        int numeroPernas;

        switch (serImaginario.toLowerCase()) {
            case "saci":
                numeroPernas = 1;
                break;
            case "centauro":
                numeroPernas = 4;
                break;
            case "harpia":
                numeroPernas = 2;
                break;
            case "grifo":
                numeroPernas = 4;
                break;
            default:
                numeroPernas = -1;
                break;
        }

        if (numeroPernas != -1) {
            System.out.println("O ser imaginário tem " + numeroPernas + " pernas.");
        } else {
            System.out.println("Não reconheço esse ser imaginário.");
        }
    }
}
