package com.mycompany.primeiroprojetopi;

import java.util.Scanner;

public class PrimeiroprojetoPI {

    public static void main(String[] args) {
        int A, B, C;
        Scanner teclado = new Scanner(System.in);
        
        A = teclado.nextInt();
        
        B = teclado.nextInt();
        C = teclado.nextInt();
        
        if ( (A < B + C) && (B < A + C) && (C < B + A)){
            System.out.print("Isso é um triangulo");
        }
        else{
            System.out.print("Não é triangulo");
        }
    }
}
