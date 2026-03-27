package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite a quantidade de linhas e colunas: ");
    
    int linhas = teclado.nextInt(), colunas = teclado.nextInt();
    int M[][] = new int [linhas][colunas];
    int i, j;

    System.out.println("Digite os elementos da matriz: ");

    for(i = 0; i<linhas; i++) {
      for(j = 0; j<colunas; j++) {
        M[i][j] = teclado.nextInt();
      }
      i++;
      //essa deu trabalho pra pensar
      for(j = colunas - 1; j>=0; j--) {
        M[i][j] = teclado.nextInt();
      }
    }

    for(i = 0; i<linhas; i++) {
      for(j = 0; j<colunas; j++) {
        System.out.print(M[i][j] + " ");
      }
              System.out.print("\n");
    }
}
}
