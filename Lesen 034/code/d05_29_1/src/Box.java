public class Box<T> {
    private T value;

    public Box(T str) {
        this.value = str;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value='" + value + '\'' +
                '}';
    }
}
