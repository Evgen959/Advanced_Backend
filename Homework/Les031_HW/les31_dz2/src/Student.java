public class Student {
    private String name;
    private Grade result;

    public Student(String name, Grade result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public String toString() {
        return name + "-" + result;
    }

    public String getName() {
        return name;
    }

    public Grade getResult() {
        return result;
    }
}
