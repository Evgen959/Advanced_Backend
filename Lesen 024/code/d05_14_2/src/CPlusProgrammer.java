public class CPlusProgrammer extends Employee implements Programmer{


    public CPlusProgrammer(String name, int salaey) {
        super(name, salaey);
    }

    @Override
    public void work() {
        System.out.println("C++ Программист");
    }

    public void writeCode(){
        System.out.println("пишу код на с++");
    }
}
