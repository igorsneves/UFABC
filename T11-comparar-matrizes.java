public class Main {
    public static boolean compararMatrizes(int[][] matriz1, int[][] matriz2) {
        
        if (matriz1.length != matriz2.length) {
            return false;
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz2[i][j] != 2 * matriz1[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
