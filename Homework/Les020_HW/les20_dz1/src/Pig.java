public class Pig extends Animals{
    private double meat;

    public Pig(String name, double feed, double meat) {
       super(name, feed);
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + getName() + '\'' +
                ", feed=" + getFeed() +
                ", weight=" + meat +
                '}';
    }

    @Override
    public void production () {
        System.out.println(getName() + " Produces meat por day: " + meat + " kg");
    }

}
