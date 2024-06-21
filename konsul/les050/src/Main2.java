import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main2 {
    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream(new File("3.txt"))) {
            System.setOut(ps);
            System.out.println("hello java");
            System.out.println("io in java is very easy");
            System.out.println("----------------------");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
