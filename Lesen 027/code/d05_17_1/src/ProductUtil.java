import java.util.List;

public class ProductUtil {
    static void print(List<Product> productList){
        for (int i=0; i<productList.size(); i++){
            System.out.printf("%d. %s%n",i+1,productList.get(i));
        }
    }

}
