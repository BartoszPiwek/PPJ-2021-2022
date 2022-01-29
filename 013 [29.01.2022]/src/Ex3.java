import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(isHex("0x4f5fc1"));
    }

    public static boolean isHex(String value) {
        Pattern patter = Pattern.compile("^0x[0-9a-fA-F]*$", Pattern.MULTILINE);

        return patter.matcher(value).find();
    }
}