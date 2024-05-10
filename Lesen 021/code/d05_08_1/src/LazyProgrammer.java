public class LazyProgrammer extends Programmer{
    public LazyProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I'm lazy");
    }
}

