import java.util.List;

public class Cohort {
    private String title;
    private List<Student> students;

    public Cohort(String title, List<Student> students) {
        this.title = title;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Cohort{" +
                "title='" + title + '\'' +
                ", students=" + students +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }
}
