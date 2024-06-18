public class Input100Exception extends RuntimeException{
    private String msg;

    public Input100Exception(String msg) {
        this.msg = msg;
    }

    public void info(){
        System.out.println(msg);
    }
}
