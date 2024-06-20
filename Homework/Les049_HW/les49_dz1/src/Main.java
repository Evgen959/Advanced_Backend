/*По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing
находится файл file.dat . Сохраните этот файл  на диск (просто “ручками”, не из программы).
Ваша программа  должна записать в отдельный файл первые 601 байт,
затем в отдельный файл записать следующие 57053 байта
и оставшиеся 22494 байта записать в следующий файл. Если все сделано правильно,
у вас должно получиться 3 файла.*/


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
// Работа с файлом (чтение из интернета)
public class Main {
    public static void main(String[] args) throws IOException {
        copy();

    }

    public static void copy() throws IOException{
        URL url = new URL("https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing");
        try (InputStream is = new  BufferedInputStream(url.openStream());
             OutputStream os = new BufferedOutputStream(new FileOutputStream("../test_temp/1copy.dat"))) {
            int count =0;
            int data;
            while ((data= is.read())!=-1){
                count++;
                if (count%1000==0){
                    System.out.println(count);
                }
                os.write(data);
            }
        }
    }
}
