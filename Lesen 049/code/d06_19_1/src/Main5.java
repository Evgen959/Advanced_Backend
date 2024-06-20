import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
                            // Работа с файлом (чтение из интернета)
public class Main5 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.ait-tr.de/");
        try (InputStream is = new  BufferedInputStream(url.openStream())) {
            int data;
            while ((data= is.read())!=-1){
                System.out.printf("%c", data);
            }
        }
    }
}
