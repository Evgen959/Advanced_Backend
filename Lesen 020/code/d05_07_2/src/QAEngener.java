public class QAEngener extends Employee {


    public QAEngener(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngener{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }

    @Override
    public void work () {
        System.out.println("I'm QA engineer " + getName() + " I check code");
    }
}
