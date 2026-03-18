package primeiroprojetopi.processamentodainformacao;

import java.util.Scanner;

public class testes {
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite Ax: ");
        double Ax = teclado.nextDouble();

        System.out.print("Digite Ay: ");
        double Ay = teclado.nextDouble();

        System.out.print("Digite Bx: ");
        double Bx = teclado.nextDouble();

        System.out.print("Digite By: ");
        double By = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow(Bx - Ax, 2) + Math.pow(By - Ay, 2));

        System.out.println("Distância entre os pontos: " + distancia);
    }
}
