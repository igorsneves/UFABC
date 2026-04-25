import java.util.Scanner;

public class MultiplosDe3Linha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(3 * i);
            
            if (i < n) {
                System.out.print(" ");
            }
        }
    }
}
