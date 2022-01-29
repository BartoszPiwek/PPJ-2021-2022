import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex4 {
    public static void main(String[] args) {
        String value = "wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim.";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(value);

        int findCounter = 0;

        while (matcher.find()) {
            findCounter++;
        }

        System.out.println("Znaleziono " + findCounter + "par liczb.");
    }
}