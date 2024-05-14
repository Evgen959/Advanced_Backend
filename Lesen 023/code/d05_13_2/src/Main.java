public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int choice = 0;

        System.out.println(getTransformer(1).transform(str));
        System.out.println(vidString(str, 2));
        System.out.println(vidString(str, 3));
    }

    public static Transformer getTransformer (String str, int choice) {
        switch (choice){
            case  1: return  new AddBrecketsTransformer();
            case  1: return  new AddParennthesisTransformer();
            case  1: return  new AddBrecketsTransformer();
            default: null;
        }

    }


}