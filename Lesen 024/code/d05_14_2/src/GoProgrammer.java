public class GoProgrammer extends Employee implements Programmer{

    public GoProgrammer(String name, int salaey) {
        super(name, salaey);
    }

    @Override
    public void work() {
        System.out.println("Go Программист");
    }

    public void writeCode(){
        System.out.println("пишу код на Go, получается очень круто!");
    }
}
