import java.io.File;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.Arrays;
                    // Работа с файлом
public class Main6 {
    public static void main(String[] args) {
        File file = new File("../1.mp4");
        System.out.println(file.isFile());
        if (file.isDirectory()){
            String[] list = file.list();
            Arrays.asList(list).forEach(s-> System.out.println(s));
        }
        Path path = Path.of("../1.mp4");// для работы с путями

    }
}
