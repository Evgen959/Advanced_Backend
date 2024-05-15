import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Programmer> list = new ArrayList<>();
        list.add(new JavaProgrammer("Jack", 5000));
        list.add(new CPlusProgrammer("Nick", 7000));

        for (Programmer p: list) {
            p.writeCode();
        }
    }

    public static void createNewSystem(Programmer programmer){
        programmer.writeCode();
    }
}