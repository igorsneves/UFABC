import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L = teclado.nextInt();
        int C = teclado.nextInt();
        teclado.nextLine();

        char[][] campo = new char[L][C];

        for (int i = 0; i < L; i++) {
            campo[i] = teclado.nextLine().toCharArray();
        }

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        char[][] resultado = new char[L][C];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {

                if (campo[i][j] == '*') {
                    resultado[i][j] = '*';
                } else {
                    int contador = 0;

                    for (int k = 0; k < 8; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];

                        if (ni >= 0 && ni < L && nj >= 0 && nj < C) {
                            if (campo[ni][nj] == '*') {
                                contador++;
                            }
                        }
                    }

                    resultado[i][j] = (char) (contador + '0');
                }
            }
        }

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(resultado[i][j]);
            }
            System.out.println();
        }
    }
}
