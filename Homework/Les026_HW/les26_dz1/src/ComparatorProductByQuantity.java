import java.util.Comparator;

public class ComparatorProductByQuantity implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getQuantity() > o2.getQuantity()){
            return 1;
        } if (o1.getQuantity() < o2.getQuantity()){
            return -1;
        }
        return 0;
    }
}
