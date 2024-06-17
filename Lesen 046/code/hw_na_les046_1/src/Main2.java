import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = List.of("Jack:6", "Ann:3", "Mark:7", "Jack:8", "Mark:9", "Ann:8", "Ann:7");
        Map<String, List<Integer>> stringListMap = listToMap(list);
        System.out.println(stringListMap);
    }

    public static Map<String, List<Integer>> listToMap(List<String> list){
        Map<String, List<Integer>> collect = list.stream()
                .collect(Collectors.groupingBy(s -> getName(s), Collectors.mapping(s -> getRate(s), Collectors.toList())));
        return collect;
    }

    // "Jack:6" -> "Jack"
    public static String getName(String s){
        return s.substring(0, s.indexOf(":"));
    }

    // "Jack:6" -> "6"
    public static Integer getRate(String s){
        return Integer.parseInt(s.split(":")[1]);
    }
}
