import java.util.List;

public class PersonUtil {

    public static void print (List<Person> people){
        for (Person p : people){
            System.out.println(p);
        }
    }public static void printString (List<String> handlerPersons){
        for (String h : handlerPersons){
            System.out.println(h);
        }
    }
}
