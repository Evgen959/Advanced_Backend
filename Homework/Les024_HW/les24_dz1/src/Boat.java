public class Boat implements  Swimmable{
    @Override
    public void swim() {
        System.out.println("Поплыла!!");
    }

    @Override
    public String getName() {
        return "Boat";
    }
}
