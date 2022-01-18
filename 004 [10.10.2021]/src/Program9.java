public class Program9 {
    public static void main(String[] args) {
        System.out.println("Program do sprawdzania roku przystępnego.");
        System.out.print("Podaj rok: ");

        java.util.Scanner in = new java.util.Scanner(System.in);
        int year = in.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Rok jest przystępny");
        } else {
            System.out.println("Rok nie jest przystępny");
        }
    }
}