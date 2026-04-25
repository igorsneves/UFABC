import java.util.Scanner;

public class NumerosPrimos {
    
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int count = 0;
        int numero = 2;

        while (count < n) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                count++;
            }
            numero++;
        }
    }
}
