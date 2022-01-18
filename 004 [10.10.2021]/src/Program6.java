public class Program6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

//        Before
        System.out.println((!( a < b ) && !( a > b )));

//        After
        System.out.println( a == b );
    }
}