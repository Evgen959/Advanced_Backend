import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {



        Map<Integer,Character> map = new HashMap<>();
        map.put(1,'a');
        map.put(2,'b');
        map.put(3,'c');
        map.put(4,'d');

        Set<Map.Entry<Integer, Character>> entries = map.entrySet();
        for (var entry: entries ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }




    }

}