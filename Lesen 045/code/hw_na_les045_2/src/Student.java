import java.util.List;

public class Student {
    private String name;
    private List<String> emails;

    public Student(String name, List<String> emails) {
        this.name = name;
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", emails=" + emails +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<String> getEmails() {
        return emails;
    }
}
