import java.util.Objects;

public class Student {
    private  String fName;
    private String lName;

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName + " " + lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(fName, student.fName) && Objects.equals(lName, student.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }
}
