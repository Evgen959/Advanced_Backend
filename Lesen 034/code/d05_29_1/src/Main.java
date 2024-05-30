public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>("qwqerwetty");
        Box<Integer> integerBox1 = new Box<>(18);

        String value = strBox.getValue();
        Integer value1 = integerBox1.getValue();

        Box2<String, Integer> box2 = new Box2<>("qwe", 10);
        System.out.println(box2);


    }
}