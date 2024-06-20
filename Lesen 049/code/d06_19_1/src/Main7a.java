import java.io.*;
                            // Работа с файлом (создаем файл с объектом Person)
public class Main7a {
    public static void main(String[] args) {
        /*
         {
         "name":"Jack",
         "age":27
         "List":[]
         }
         */

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("1.dat"))) {
            Person o = (Person)is.readObject();
            System.out.println("Загружено:");
            System.out.println(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
