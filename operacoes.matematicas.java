package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira dois valores para operações.");
    
        System.out.print("Digite o valor de A: ");
        int A = teclado.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = teclado.nextInt();

        int soma = A + B;
        int subtracao = A - B;
        int multiplicacao = A * B;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        if (B != 0) {
            double divisao = (double) A / B;
            int divisaoInteira = A / B;
            int resto = A % B;

            System.out.println("Divisão: " + divisao);
            System.out.println("Divisão inteira: " + divisaoInteira);
            System.out.println("Resto: " + resto);
        } else {
            System.out.println("Divisão: inexistente");
            System.out.println("Divisão inteira: inexistente");
            System.out.println("Resto: inexistente");
        }
    }
}
