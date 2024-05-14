public class Singleton {
    private String title;
    private static final Singleton INSTANCE = new Singleton("one");

    private Singleton(String title) {
        this.title = title;
    }

    static Singleton getInstance(){
        return INSTANCE;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "title='" + title + '\'' +
                '}';
    }
}
