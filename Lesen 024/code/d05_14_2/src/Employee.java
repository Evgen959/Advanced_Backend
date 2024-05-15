public abstract class Employee {
    private String name;
    private int salaey;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salaey=" + salaey +
                '}';
    }

    public Employee(String name, int salaey) {
        this.name = name;
        this.salaey = salaey;
    }

    public abstract void work();

    public void salaey(){
        System.out.println(name + "Pay salary" + salaey);
    }

}
