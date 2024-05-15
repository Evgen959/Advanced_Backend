public class Programmer extends Employee{


    public Programmer(String name, int salaey) {
        super(name, salaey);
    }

    @Override
    public void work() {
        System.out.println("Программист");
    }
}
