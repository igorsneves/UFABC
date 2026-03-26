package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();

        int valor = 1;

        for (int i = 0; i < L; i++) {
            int[] linha = new int[C];

            // Preenche a linha
            for (int j = 0; j < C; j++) {
                linha[j] = valor;
                valor++;
            }

            // Imprime em zig-zag
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

        sc.close();
    }
}
