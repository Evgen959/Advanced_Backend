public class Duck implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Поплыла!!");
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
