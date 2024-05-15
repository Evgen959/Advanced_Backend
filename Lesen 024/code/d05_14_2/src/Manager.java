public class Manager extends Employee{
    public Manager(String name, int salaey) {
        super(name, salaey);
    }

    @Override
    public void work() {
        System.out.println("manager");
    }
}
