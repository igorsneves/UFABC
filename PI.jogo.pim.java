package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int limite = 4 * n;

        for (int i = 1; i <= limite; i++) {
            if (i % 4 == 0) {
                System.out.print("PIM");
            } else {
                System.out.print(i);
            }

            if (i < limite) {
                System.out.print(" ");
            }
        }
    }
}
