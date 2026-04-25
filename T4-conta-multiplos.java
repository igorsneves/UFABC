import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int mult3 = 0;
        int mult5 = 0;

        System.out.println("Digite números (0 para encerrar):");

        do {
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 3 == 0) {
                    mult3++;
                }
                if (numero % 5 == 0) {
                    mult5++;
                }
            }

        } while (numero != 0);

        System.out.println("Múltiplos de 3: " + mult3);
        System.out.println("Múltiplos de 5: " + mult5);

    }
}
