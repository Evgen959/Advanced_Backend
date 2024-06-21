import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Charset.availableCharsets());
        try (BufferedReader br = new  BufferedReader (new FileReader("txt1.txt", Charset.defaultCharset()))) {
            String s = null;
            while ((s =br.readLine())!=null) {
                System.out.println(s);
            }
        }catch (IOException e){
            System.out.println("error!!!!");
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new  BufferedReader (new FileReader("txt1.txt", Charset.defaultCharset()))) {
            list = br.lines().toList();
        }catch (IOException e){
            System.out.println("error!!!!");
        }
        System.out.println(list);

        try {
            BufferedReader br = new  BufferedReader (new FileReader("txt1.txt", Charset.forName("KOI8-R")));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}