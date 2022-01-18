public class Program8 {
    public static void main(String[] args) {
        int wrt = -4;

        if ((wrt > -15 && wrt < -10) || (wrt > -5 && wrt < 0) || wrt > 5 && wrt < 10) {
            System.out.println("A");
        }

        if ((wrt <= -13) || (wrt > -8 && wrt <= -3)) {
            System.out.println("B");
        }

        if (wrt >= -4) {
            System.out.println("C");
        }
    }
}