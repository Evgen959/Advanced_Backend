public class LazySingleton {
    private String title;
    private static LazySingleton instance = null;

    private LazySingleton(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LazySingleton{" +
                "title='" + title + '\'' +
                '}';
    }

    public static LazySingleton getInstance(String title){
        if (instance == null) {
            instance = new LazySingleton(title);
        }
        return instance;
    }
}
