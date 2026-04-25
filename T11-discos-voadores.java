public class Main {
    public static int obterPrazoEntrega(int disco1, int disco2, int disco3) {
        if (disco1 == disco2 && disco2 == disco3) {
            return 5;
        } 
        else if (disco1 != disco2 && disco1 != disco3 && disco2 != disco3) {
            return 30;
        } 
        else {
            return 15;
        }
    }
}
