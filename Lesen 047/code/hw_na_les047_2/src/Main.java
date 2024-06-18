/* 4. Дан текст (в рамках данной задачи текст не содержит знаков препинания,
слова разделены пробелом). Ваша задача написать метод,
который сформирует map<Boolean, List<String>> где ключу true соответствует список слов,
которые встретились в тексте меньше 3 раз, а ключу false список остальных слов.*/


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String text = "jack ann jack lena ann ann jack poul jack ann jack poul lena";
        Map<String, Integer> map = countingWords(text);
        System.out.println(map);
        // {ann=4, poul=2, lena=2, jack=5}
        Map<Boolean, List<String>> partitionin = partitionin(map);
        System.out.println(partitionin);
        // {false=[ann, jack], true=[poul, lena]}
    }

    public static Map<String, Integer> countingWords(String str){
        return countingWords(Arrays.asList(str.split(" ")), s -> s);// преобразовываем в массив
    }

    public static <T, R> Map<R, Integer> countingWords(Collection<T> list, Function<T,R> keyFunction){
        return list.stream()
                .collect(Collectors.toMap(keyFunction, s -> 1, (i1,i2)-> ++i1));// собераем в Мар
    }

    public static Map<Boolean, List<String>> partitionin(Map<String, Integer> contingWords){
        return contingWords
                .keySet().stream()
                // partitioningBy() -> map<Boolean, List<String>>
                .collect(Collectors.partitioningBy(w->contingWords.get(w)<3));
    }
}