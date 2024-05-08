public class Animals {
    private String name;
    private  double feed;

    public Animals(String name, double feed) {
        this.name = name;
        this.feed = feed;
    }

    public void feed () {
        System.out.println(name + " get the feed per month: " + feed + " kg");
    }

    public String getName() {
        return name;
    }

    public double getFeed() {
        return feed;
    }

    public void production() {}
}
