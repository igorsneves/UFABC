import java.util.Scanner;

public class PedidosAtendidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int estoque = scanner.nextInt();
        int n = scanner.nextInt();

        int atendidos = 0;

        for (int i = 0; i < n; i++) {
            int pedido = scanner.nextInt();

            if (pedido <= estoque) {
                atendidos++;
                estoque -= pedido;
            }
        }

        System.out.println(atendidos);

    }
}
