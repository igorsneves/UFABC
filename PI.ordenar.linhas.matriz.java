package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int m = teclado.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m - 1; j++) {
                for (int k = 0; k < m - 1 - j; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
