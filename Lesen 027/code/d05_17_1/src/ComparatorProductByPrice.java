import java.util.Comparator;

public class ComparatorProductByPrice implements ComparatorProduct {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }

    @Override
    public String getDescription() {
        return "по цене";
    }
}
