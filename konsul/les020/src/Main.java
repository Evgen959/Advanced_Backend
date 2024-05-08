import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();
        listString.add("Anna");
        listString.add("Katy");
        listString.add("Dima");
        listString.add("Masha");
        listString.add("Maksim");
        listString.add("Vasy");
        listString.add("Vadim");
        listString.add("Valentina");
        System.out.println(listString);
        for (int i = listString.size()-1; i >= 0  ; i--) {
            System.out.println(listString.get(i));
        }


        // Collections.reverse(listString);
        // System.out.println(listString);
    }
}

/*
JVM (Java Virtual Machine) - java.exe
JRE (Java Runtime Environment)
JDK (Java Development Kit)
LTS (Long Time Support) 8 11 17 21
*/









