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
“AnnJack” = 23*/


import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Map<String,Integer> sumOfValues (Map<String,Integer> map, String key1, String key2){
        if (map.containsKey(key1) && map.containsKey(key2)){
            map.put((key1+key2), (map.get(key1) + map.get(key2)));
        }
        return map;
    }
}