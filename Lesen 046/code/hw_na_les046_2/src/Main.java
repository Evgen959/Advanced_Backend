/* 2. Дан текст (в рамках данной задачи текст не содержит знаков препинания,
слова разделены пробелом). Ваша задача написать метод, который сформирует частотный словарь,
т.е. получить map<String, Integer> где ключ - слово,
значение - сколько раз оно встречалось в тексте.*/

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "anna jack lena anna john lena lena";
        Map<String, Integer> map = countingWords(str);
        System.out.println(map);
        // {john=1, anna=2, lena=3, jack=1}

        List<Person> people = List.of(
                new Person("Jack", 10),
                new Person("John", 20),
                new Person("Jack", 10),
                new Person("Jack", 14),
                new Person("Jack", 19),
                new Person("Jack", 19),
                new Person("Lena", 19),
                new Person("Lena", 25)
                );
        Map<Person, Integer> map1 = countingWords(people);
        System.out.println(map1);
        //{Person{name='Lena', age=25}=1, Person{name='Jack', age=14}=1,
        // Person{name='Jack', age=19}=2, Person{name='Lena', age=19}=1,
        // Person{name='John', age=20}=1, Person{name='Jack', age=10}=2}

        Map<String, Integer> map2 = countingWords(people, p -> p.getName());
        System.out.println(map2);
        // {Lena=2, John=1, Jack=5}

        Map<Integer, Integer> map3 = countingWords(people, p -> p.getAge());
        System.out.println(map3);
        // {19=3, 20=1, 25=1, 10=2, 14=1}

    }

    /*public static Map<String, Integer> countingWords(String str){
        return Arrays.asList(str.split(" ")).stream()
                .collect(Collectors.toMap(s -> s, s -> 1, (i1,i2)-> ++i1));
    }*/

    public static Map<String, Integer> countingWords(String str){
        return countingWords(Arrays.asList(str.split(" ")));

    }

    public static <T> Map<T, Integer> countingWords(Collection<T> list){
        return list.stream()
                .collect(Collectors.toMap(s -> s, s -> 1, (i1,i2)-> ++i1));
    }

    public static <T, R> Map<R, Integer> countingWords(Collection<T> list, Function<T,R> keyFunction){
        return list.stream()
                .collect(Collectors.toMap(keyFunction, s -> 1, (i1,i2)-> ++i1));
    }
}