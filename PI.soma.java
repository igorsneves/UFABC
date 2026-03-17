package com.mycompany.primeiroprojetopi;

import java.util.Scanner;

public class PrimeiroprojetoPI {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = teclado.nextInt();

        soma = num1 + num2;

        System.out.print("A soma é: " + soma);

    }
}
