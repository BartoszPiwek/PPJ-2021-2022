import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public static void main(String[] args) {
        String value = "A.B.C.D.E.F.G.Z.Y";

        Pattern pattern = Pattern.compile("[A-Z].*");
        Matcher matcher = pattern.matcher(value);

        System.out.println(matcher.find());
    }
}