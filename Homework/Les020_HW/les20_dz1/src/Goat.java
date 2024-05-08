public class Goat extends  Animals{
    private double milk;

    public Goat(String name, double feed, double milk) {
        super(name, feed);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Goat{" +
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
