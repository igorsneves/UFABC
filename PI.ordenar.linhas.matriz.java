package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int linhas = teclado.nextInt();
        int colunas = teclado.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas - 1; j++) {
                for (int k = 0; k < colunas - 1 - j; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
