import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        //System.out.println(tree.getDelta());
        tree.grow();
        System.out.println(tree);
        List<String> list = new ArrayList<>();
        list.add("1qwe");
        list.add("2qwe");
        list.add("3qwe");
        list.add("4qwe");
        list.add("5qwe");
        list.add("6qwe");
        list.add("7qwe");
        list.add("7qwe");
        String str = "3qwe";
        for (String s: list){
            if(str.hashCode()==s.hashCode() && str.equals(s)){
                System.out.println("равны");
            }
        }
    }
}