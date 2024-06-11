import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jack", "John", "Nick", "Nikolaus", "Alexander", "Sergey", "Misha"));

        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(collect);

       /* Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });*/

        Collections.sort(list, (String o1, String o2) -> {return o1.length()-o2.length();});
    }
}