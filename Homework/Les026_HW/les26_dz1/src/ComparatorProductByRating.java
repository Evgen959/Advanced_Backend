import java.util.Comparator;

public class ComparatorProductByRating implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getRating() > o2.getRating()){
            return 1;
        } if (o1.getRating() < o2.getRating()){
            return -1;
        }
        return 0;
    }
}
