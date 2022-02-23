import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        String value = "";

        try{
            FileReader fr = new FileReader("src/data.txt");

            int bite = fr.read();

            while(bite != -1){
                value += (char)bite;
                bite = fr.read();
            }

            fr.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Zawartość pliku data.txt: " + value);
    }
}