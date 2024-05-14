public class Main {
    public static void main(String[] args) {
        // pattern Singleton
        // шаблон Одиночко

        //Singleton singleton = new Singleton("two");
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

        System.out.println("----------------------");
        LazySingleton lazySingleton1 = LazySingleton.getInstance("one");
        System.out.println(lazySingleton1);


        LazySingleton lazySingleton2 = LazySingleton.getInstance("one");
        System.out.println(lazySingleton2);
    }
}