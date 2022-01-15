public class Program5 {
    public static void main(String[] args) {
        int value = 13;
//        int value = 15;
//        int value = 17;
        boolean isPrimary = true;

        if (value > 1) {
            for (int i = 2; isPrimary && i <= value / 2; i++) {
                if (value % i == 0) {
                    isPrimary = false;
                }
            }
        } else {
            isPrimary = false;
        }

        if (isPrimary) {
            System.out.println("Liczba jest pierwsza");
        } else {
            System.out.println("Liczba nie jest pierwsza");
        }
    }
}