/* 1. Дан список строк вида: ‘Jack:43’ т.е. формат ‘Имя_студента:Оценка’.
Написать метод, который сформирует Map<String, List<Integer>> такой,
что ключ - имя студента, а значение список его оценок.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack:6", "Ann:3", "Mark:7", "Jack:8", "Mark:9", "Ann:8", "Ann:7");
        Map<String, List<Integer>> stringListMap = listToMap(list);
        System.out.println(stringListMap);

        Map<String, List<Integer>> stringListMap1 = listToMap2(list);
        System.out.println(stringListMap1);
    }

    public static Map<String, List<Integer>> listToMap(List<String> list){
        Map<String, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, s.indexOf(":"))));

        Map<String, List<Integer>> collect = map.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> listStringTolistInteger(e.getValue())));
        return collect;
    }

    // "Ann:3", "Ann:8", "Ann:7" -> 3,8,7
    public static List<Integer> listStringTolistInteger(List<String> list){
        return list.stream()
                .map(s -> s.split(":"))
                .filter(arr->arr.length==2)
                .map(arr->arr[1])
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
    }

    public static Map<String, List<Integer>> listToMap2(List<String> list){
        return list.stream()
                .collect(Collectors.toMap(s -> s.substring(0, s.indexOf(":")), s->singleValeList(s), (l1,l2) ->{l1.addAll(l2); return l1;}));
    }

    //Ann:3-> List<Integer> [3]
    public static List<Integer> singleValeList(String str){
        List<Integer> res = new ArrayList<>();
        res.add(Integer.parseInt(str.split(":")[1]));
        return res;
    }
}