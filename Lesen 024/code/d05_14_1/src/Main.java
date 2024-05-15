import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int choice = 0;

        System.out.println(getTransformer(1).transform(str));
        System.out.println(getTransformer(2).transform(str));
        System.out.println(getTransformer(3).transform(str));

        System.out.println("--------------------------------------");
        List<Transformer> listTransformers = new ArrayList<>();
        listTransformers.add(new AddParenthesisTransformer());
        listTransformers.add(new AddBracketsTransformer());
        listTransformers.add(new ToUpperCaseTransformer());
        listTransformers.add(new AddBracketsTransformer());

        for (Transformer transformer : listTransformers){
            str= transformer.transform(str);
        }
        System.out.println(str);

        System.out.println("--------------------------------------------------");
        List<String> list = new ArrayList<>();
        list.add("Jack");
        list.add("James");
        list.add("Ann");
        list.add("Lena");
        list.add("Igor");
        list.add("Stan");
        list.add("Nick");
        System.out.println(list);
        listHandler(list,new AddBracketsTransformer());
        System.out.println(list);
        listHandler(list,new NewTransformer());
        System.out.println(list);

    }

    public static void listHandler(List<String> list, Transformer transformer){
        System.out.println(transformer.getTransformationDescription());
        for (int i = 0; i < list.size(); i++) {
            String str= transformer.transform(list.get(i));
            list.set(i, str);
        }
    }

    public static Transformer getTransformer ( int choice) {
        switch (choice){
            case 1: return new AddBracketsTransformer();
            case 2: return new AddParenthesisTransformer();
            case 3: return new ToUpperCaseTransformer();
            default: return null;
        }

    }


}