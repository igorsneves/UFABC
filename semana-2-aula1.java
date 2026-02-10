package com.mycompany.primeiroprojetopi;

import java.util.Scanner;

public class PrimeiroprojetoPI {

    public static void main(String[] args) {
      int numFaltas = 0;
      double nota1, nota2, media;
      Scanner coleta = new Scanner(System.in);
      
      System.out.print("Digite a nota 1: ");
      nota1 = coleta.nextDouble();
      System.out.print("Digite a nota 2: ");
      nota2 = coleta.nextDouble ();
      System.out.print("Digite o numero de faltas: ");
      numFaltas = coleta.nextInt ();
      
      media = ( nota1 + nota2 ) / 2;

      if ((media > 5) && ( numFaltas <= 12 )){
          System.out.print("Você foi aprovado!");
      }
      else {
          System.out.print("Você foi reprovado");
      }
    }
}

