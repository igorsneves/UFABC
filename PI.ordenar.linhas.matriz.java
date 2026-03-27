
import java.util.Scanner;

public class testes {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas e colunas:");

        int linhas = teclado.nextInt();
        int colunas = teclado.nextInt();
        int i, j, k;

        int[][] matriz = new int[linhas][colunas];
        
        System.out.print("Digite os valores: ");

        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas - 1; j++) {
                for (k = 0; k < colunas - 1 - j; k++) {
                    if (matriz[i][k] > matriz[i][k + 1]) {
                        int temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }

        for (i = 0; i < linhas; i++) {
            for (j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
