public interface Autoprintabie extends Printable{
    void print();

    default void print(String msg){
        print();
    }
}
