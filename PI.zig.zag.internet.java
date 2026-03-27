package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L = teclado.nextInt();
        int C = teclado.nextInt();

        int valor = 1;

        for (int i = 0; i < L; i++) {
            int[] linha = new int[C];

            for (int j = 0; j < C; j++) {
                linha[j] = valor;
                valor++;
            }

            if (i % 2 == 0) {
                for (int j = 0; j < C; j++) {
                    System.out.print(linha[j] + " ");
                }
            } else {
                for (int j = C - 1; j >= 0; j--) {
                    System.out.print(linha[j] + " ");
                }
            }

            System.out.println();
        }
    }
}
