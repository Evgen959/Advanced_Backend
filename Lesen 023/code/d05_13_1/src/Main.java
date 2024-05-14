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
        listTransformers.add(new AddParennthesisTransformer());
        listTransformers.add(new AddBrecketsTransformer());
        listTransformers.add(new ToUpperCaseTransformer());
        listTransformers.add(new AddBrecketsTransformer());

        for (Transformer transformer : listTransformers){
            str= transformer.transform(str);
        }
        System.out.println(str);
    }

    public static Transformer getTransformer ( int choice) {
        switch (choice){
            case 1: return new AddBrecketsTransformer();
            case 2: return new AddParennthesisTransformer();
            case 3: return new ToUpperCaseTransformer();
            default: return null;
        }
    }
}