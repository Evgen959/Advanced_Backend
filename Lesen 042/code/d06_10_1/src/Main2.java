import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {

        List<String> list = List.of("Jeck", "John", "Ann");

        List<String> list1 = listHandler(list, new StringTransformer() {
            @Override
            public String transform(String str) {
                return str.toUpperCase();
            }
        });
        System.out.println(list1);

        List<String> list2 = listHandler(list, new StringTransformer() {
            @Override
            public String transform(String str) {
                return "(" + str + ")";
            }
        });
        System.out.println(list2);

        List<String> list3 = listHandler(list, (String str) -> { return "(" + str + ")"; } );
        System.out.println(list3);

        List<String> list4 = listHandler1(list, (String str) -> { return "(" + str + ")"; } );
        System.out.println(list4);
    }

    public static List<String> listHandler1(List<String> list, UnaryOperator<String> transformer){
        List<String> result = new ArrayList<>();
        for (String str: list){
            result.add(transformer.apply(str));
        }
        return result;
    }

    public static List<String> listHandler(List<String> list, StringTransformer transformer){
        List<String> result = new ArrayList<>();
        for (String str: list){
            result.add(transformer.transform(str));
        }
        return result;
    }
}
