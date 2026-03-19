package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = teclado.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] == 1) {
                if (i - 1 >= 0) {
                    soma += vetor[i - 1];
                }
                if (i + 1 < n) {
                    soma += vetor[i + 1];
                }
            }
        }
        System.out.println(soma);
    }
}
