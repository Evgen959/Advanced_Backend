/* 4
Дан лист строк, нужно получить Map<String, Boolean>, где ключ - строка,
значение - true, если строка встретилась более одного раза, иначе false*/


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

    }

    public static Map<String, Boolean> stringMapToBoolean(List<String> list){
        return
                list.stream()
                .collect(Collectors.toMap(s->s, s->true, (b1,b2) -> false));
    }
}
