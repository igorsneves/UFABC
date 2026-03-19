package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = teclado.nextInt();
        }

        boolean espelhado = true;

        for (int i = 0; i < n / 2; i++) {
            if (vetor[i] != vetor[n - 1 - i]) {
                espelhado = false;
                break;
            }
        }

        if (espelhado) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
