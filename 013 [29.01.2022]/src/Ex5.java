import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/data.txt");

            int bajt = fr.read();

            while(bajt != -1){
                System.out.print( (char) bajt);
                bajt = fr.read();
            }

            fr.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}