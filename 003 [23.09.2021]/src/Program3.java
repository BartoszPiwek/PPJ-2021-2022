public class Program3 {
    public static void main(String[] args) {
//        false
        System.out.println(( true && !true ) || ( true && !true ));

//        true
        System.out.println(( true && !false ) || ( false && !true ));

//        true
        System.out.println(( false && !true ) || ( true && !false ));

//        false
        System.out.println(( false && !false ) || ( false && !false ));
    }
}