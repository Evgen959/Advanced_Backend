public class Main2 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Sergey");
        programmer.setStatus("занят");

        String result = programmer.doWork("hello java");
        System.out.println(result);
    }
}
