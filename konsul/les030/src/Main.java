import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document document1 = new Document("text text text text", "#AAA-223");
        Document document2 = new Document("text text text text", "#AAA-223");
        Student student1 = new Student("Ivan", "1");

        print("Message #1", document1);
        print("Message #2", document2);
        print("Message #3", student1);

        List<Printable> printableList = new ArrayList<>();
        printableList.add(document1);
        printableList.add(student1);

        Printable student3 = new Student("Jeck", "1");

        Student student4 = (Student) student3;
        Printable student5 = student4;

        Note note = new Note("qwerty");
        print("123345", note);
    }

    public static void print(String msg, Printable printable){
        printable.print(msg);
    }
}