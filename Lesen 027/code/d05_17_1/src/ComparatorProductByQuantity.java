import java.util.Comparator;

public class ComparatorProductByQuantity implements ComparatorProduct {

    @Override
    public int compare(Product o2, Product o1) {
        return o1.getQuantity()-o2.getQuantity();
    }

    @Override
    public String getDescription() {
        return "по остатку на складе";
    }
}
