import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public static void main(String[] args) {
//        String date = "2022-01-29";
        String date = "2022-2-4";

        Pattern pattern = Pattern.compile("(\\d{4})-(\\d{1,2})-(\\d{1,2})");
        Matcher matcher = pattern.matcher(date);

        if (matcher.find()) writeDate(matcher);
    }

    public static void writeDate(Matcher value) {
        System.out.println("Year: " + value.group(1) + "; Month: " + value.group(2) + "; Day: " + value.group(3));
    }
}