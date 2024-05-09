public abstract class Employee {
    private String name;
    private  double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void salary () {
        System.out.println(name + " get the salary " + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();
    // public void work(){}

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;
    }

}
