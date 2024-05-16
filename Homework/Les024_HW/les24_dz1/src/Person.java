public class Person implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Поплыл!!");
    }

    @Override
    public String getName() {
        return "Person";
    }
}
