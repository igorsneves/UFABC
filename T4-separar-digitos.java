import java.util.Scanner;

public class DigitosInversos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
        }

        if (n < 0) {
            n = -n;
        }

        while (n > 0) {
            int digito = n % 10;
            System.out.println(digito);
            n = n / 10;
        }
    }
}
