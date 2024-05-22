import java.util.Comparator;

public class ComparatorProductByTitle implements ComparatorProduct {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    @Override
    public String getDescription() {
        return "по названию";
    }
}
