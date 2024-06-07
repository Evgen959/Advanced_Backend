/*2
Допустим, каждый раз, когда студент приходит на лекцию, преподаватель заносит его имя в список.
Таким образом, у вас есть список имен, т.е. List<String>,
в котором одно и то же имя может встречаться несколько раз.
Напишите метод, который сформирует Map<String,Integer> где ключ - это имя из списка,
а значение - сколько раз данное имя встретилось в списке*/


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<String,Integer> attendanceClass(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String s: list){
            if (map.containsKey(s)){
                map.put(s, (map.get(s)+1));
            } else {
                map.put(s, 1);
            }

        }


        return map;
    }
}