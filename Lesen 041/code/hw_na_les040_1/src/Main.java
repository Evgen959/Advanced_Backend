/*1.
У вас есть Map<String,Integer>. Необходимо написать метод, который проверяет,
есть ли в заданном map 2 заданных ключа key1 и key2.
Если оба ключа есть, необходимо добавить в map ключ key1key2  и записать в него значение,
равное сумме значений из ключей key1 и key2
Пример:
        “Jack” = 18
        “John” = 9
        “Ann” = 5
Если метод вызвать с ключами “Ann” и “Jack” в указанном map должна появиться запись
“AnnJack” = 23
-----------------------------
Пример:
        “Jack” = noll
        “John” = 9
        “Ann” = 5
Если метод вызвать с ключами “Ann” и “Jack” в указанном map должна появиться запись
“AnnJack” = 5

Пример:
        “Jack” = null
        “John” = 9
        “Ann” = 5
Если метод вызвать с ключами “Ann” и “Jack” в указанном map должна появиться запись
“AnnJack” = null
*/



import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("jack", null);
        map.put("ann", 12);
        map.put("john", 18);

        addTwoKeysValue(map, "jack", "ann");
        System.out.println(map);
    }

    public static void addTwoKeysValue(Map<String,Integer> map, String key1, String key2){
        Integer value1 = map.get(key1);
        Integer value2 = map.get(key2);
        if (value1!=null && value2!=null){
            map.put(key1+key2, value1+value2);
        } else {
            if (map.containsKey(key1) && map.containsKey(key2)){
                Integer value = null;
                value = (value1!=null)? value1: value;
                value = (value2!=null)? value2: value;
                map.put(key1+key2, value);
            }
        }
    }
}