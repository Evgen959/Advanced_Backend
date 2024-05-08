public class Cow extends Animals{
    private double milk;

    public Cow(String name, double feed, double milk) {
        super(name, feed);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + getName() + '\'' +
                ", feed=" + getFeed() +
                ", milk=" + milk +
                '}';
    }

    @Override
    public void production () {
        System.out.println(getName() + " Produces milk por day: " + milk + " l");
    }
}
