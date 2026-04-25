import java.util.Scanner;

public class SomaAteZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        System.out.println("Digite números (0 para encerrar):");

        do {
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma: " + soma);

    }
}
