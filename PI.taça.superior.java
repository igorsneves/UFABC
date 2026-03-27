package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int i, j;
        double[][] A = new double[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                A[i][j] = teclado.nextDouble();
            }
        }

        double soma = 0.0;

        for (i = 0; i <= n / 2; i++) {
            for (j = i; j <= n - 1 - i; j++) {
                soma += A[i][j];
            }
        }

        System.out.printf("Resultado = %.2f\n", soma);
    }
}
