public class JavaProgrammer extends Employee implements Programmer{

    public JavaProgrammer(String name, int salaey) {
        super(name, salaey);
    }

    @Override
    public void work() {
        System.out.println("Java Программист");
    }

    public void writeCode(){
        System.out.println("пишу код на java");
        System.out.println("добавляю spring");
    }
}
