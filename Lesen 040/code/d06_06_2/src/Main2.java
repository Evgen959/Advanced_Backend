import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "John", "Jim", "Ann", "Alexandr",
                                     "Evgenii", "T", "rvvjfjfg", "fsdhgfoyguiyioujaasdfsf");
        Map<Integer, List<String>> map = new HashMap<>();

        for (String name: names){
            List<String> list = map.get(name.length());
            if (list==null){
                list = new ArrayList<>();
                list.add(name);
                map.put(name.length(), list);
            } else {
                list.add(name);
                //map.put(name.length(), list);
            }
        }
        System.out.println(map);


      /*  Set<Integer> keySet = map.keySet();
        for (Integer key: keySet){ // перебераем по ключу
            System.out.println(key + " value=" + map.get(key));
        }

        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<String>> entry : entries){ // перебераем по Entry
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

    }
}
