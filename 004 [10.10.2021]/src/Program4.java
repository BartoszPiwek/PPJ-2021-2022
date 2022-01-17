public class Program4 {
    public static void main(String[] args) {
//        Prev code
        /*
        boolean doesSignificantWork = false;
        boolean makesBreakthrough = true;
        boolean nobelPrizeCandidate;
        if (doesSignificantWork) {
            if (makesBreakthrough)
                nobelPrizeCandidate = true;
            else
                nobelPrizeCandidate = false;
        }
        else if (!doesSignificantWork)
            nobelPrizeCandidate = false;
        */

//        New code
        boolean doesSignificantWork = false;
        boolean makesBreakthrough = true;
        boolean nobelPrizeCandidate = false;

        if (doesSignificantWork && makesBreakthrough) {
            nobelPrizeCandidate = true;
        }

        System.out.println(nobelPrizeCandidate);
    }
}