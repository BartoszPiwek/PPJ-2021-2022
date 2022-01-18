public class Program11 {
    public static void main(String[] args) {
        System.out.println("Program do wyświetlenia tabliczki mnożenia.");
        System.out.print("Podaj liczbę: ");

        java.util.Scanner in = new java.util.Scanner(System.in);
        int value = in.nextInt();

        for (int row = 1; row <= value; row++) {
            for (int column = 1; column <= value; column++) {
                System.out.print(row * column + "\t\t");
            }

            System.out.println();
        }
    }
}