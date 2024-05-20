import java.util.Comparator;

public class ComparatorProductByRating implements ComparatorProduct {

    @Override
    public int compare(Product o2, Product o1) {
        return Double.compare(o1.getRating(),o2.getRating());
    }

    @Override
    public String getDescription() {
        return "по рейтингу";
    }
}
