// Expected
// No, I am here!
// No, actually , I am here!
public class Program3 {
    public static void main(String[] args) {
        int zmInt = 4 ;
        double zmDouble = -1.0;
        if (zmInt > 0)
            if (zmDouble > 0)
                System.out.println("HereIam!");
            else
                System.out.println("No, I am here!") ;
        System.out.println("No, actually , I am here!");
    }
}