import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = List.of("Jeck", "John", "Ann");

        listHandler(list, new StringTransformer() {
            @Override
            public String transform(String srt) {
                return "("+ srt +")";
            }
        });
        System.out.println(list);
    }

    public static List<String> listHandler(List<String> list, StringTransformer transformer){
        List<String> result = new ArrayList<>();
        for (String str: list){
            result.add(transformer.transform(str));
        }
        return result;
    }
}
