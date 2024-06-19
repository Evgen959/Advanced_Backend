public class Main {
    public static void main(String[] args) {
        temp(0);
    }

    public static void temp(int a) throws MyException{
        System.out.println("start method temp");
        System.out.println(a);
        if (a==0){
            throw  new MyException();
        }
        System.out.println("finish method temp");
    }
}