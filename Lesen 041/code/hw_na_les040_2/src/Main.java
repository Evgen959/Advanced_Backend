/*
Допустим, каждый раз, когда студент приходит на лекцию,
преподаватель заносит его имя в список.
Таким образом, у вас есть список имен, т.е. List<String>,
в котором одно и то же имя может встречаться несколько раз.
Напишите метод, который сформирует Map<String,Integer> где ключ - это имя из списка,
а значение - сколько раз данное имя встретилось в списке

 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> mapNameCount(List<String> list){
        Map<String, Integer> result = new HashMap<>();
        if (list!=null) {
            for (String name : list) {
                Integer value = result.getOrDefault(name, 0);
                result.put(name, ++value);
            }
        }
        return result;
    }

}