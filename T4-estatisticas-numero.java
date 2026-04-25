import java.util.Scanner;

public class Estatisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int soma = 0;
        int numero;

        numero = scanner.nextInt();
        int min = numero;
        int max = numero;
        soma += numero;
      
        for (int i = 1; i < n; i++) {
            numero = scanner.nextInt();
            soma += numero;

            if (numero < min) min = numero;
            if (numero > max) max = numero;
        }

        double media = (double) soma / n;

        System.out.println(soma);
        System.out.printf("%.2f\n", media);
        System.out.println(min);
        System.out.println(max);
    }
}
