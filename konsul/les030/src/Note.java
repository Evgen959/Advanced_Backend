public class Note implements Autoprintabie{
    private String text;

    public Note(String text) {
        this.text = text;
    }


    @Override
    public void print() {
        System.out.println("NOTE");
    }

    @Override
    public void print(String msg) {
        System.out.println("NOTE" + msg);
    }
}
