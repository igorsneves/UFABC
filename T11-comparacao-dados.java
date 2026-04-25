public class Main {
    public static int compararDatas(int d1, int m1, int a1, int d2, int m2, int a2) {
        if (a1 < a2) {
            return -1;
        } 
        else if (a1 > a2) {
            return 1;
        } 
        else {
            if (m1 < m2) {
                return -1;
            } 
            else if (m1 > m2) {
                return 1;
            } 
            else {
                if (d1 < d2) {
                    return -1;
                } 
                else if (d1 > d2) {
                    return 1;
                } 
                else {
                    return 0;
                }
            }
        }
    }
}
