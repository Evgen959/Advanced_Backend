import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
                                // Работа с файлом (создаем файл с объектом Person)
public class Main7 {
    public static void main(String[] args) {
        /*
         {
         "name":"Jack",
         "age":27
         "List":[]
         }
         */

        Person p = new Person("Jack", 25);
        String str = "java";
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("1.dat"))) {
            os.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
