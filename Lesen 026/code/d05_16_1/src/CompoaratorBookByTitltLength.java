import java.util.Comparator;

public class CompoaratorBookByTitltLength implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitl().length() - o2.getTitl().length();
    }
}
