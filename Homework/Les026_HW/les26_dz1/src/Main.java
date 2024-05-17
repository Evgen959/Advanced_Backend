/*
    Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование,
цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары
и в зависимости от выбора пользователя, выводить список товаров в нужном порядке
    Например: по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе.
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Fishing fod 1", 3, 11.55, 13));
        productList.add(new Product("Fishing fod 2", 1, 5.06, 30));
        productList.add(new Product("Fishing fod 3", 5, 24.98, 8));
        productList.add(new Product("Fishing fod 4", 5, 20.58, 2));
        productList.add(new Product("Fishing fod 5", 2, 14.00, 10));
        ProductUtil.printListProduct(productList);

        String[] sortingProducts = {
                "By Price Ascending",
                "By Price Descending",
                "By Rating",
                "By Quantity"
        };

        int number = scannerSorting(sortingProducts);
        sorting(3, productList);

        /*System.out.println("----------- Comparator By Price Ascending ---------------");
        Collections.sort(productList, new ComparatorProductByPriceAscending());
        ProductUtil.printListProduct(productList);
        System.out.println("----------- Comparator By Price Descending ---------------");
        Collections.sort(productList, new ComparatorProductByPriceDescending());
        ProductUtil.printListProduct(productList);
        System.out.println("----------- Comparator By Rating ---------------");
        Collections.sort(productList, new ComparatorProductByRating());
        ProductUtil.printListProduct(productList);
        System.out.println("----------- Comparator By Quantity ---------------");
        Collections.sort(productList, new ComparatorProductByQuantity());
        ProductUtil.printListProduct(productList);*/
    }

    public static int scannerSorting (String[] sortingProducts){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вид сортировки:");
        for (int i = 0; i < sortingProducts.length; i++) {
            System.out.println(i + " :" + sortingProducts[i]);
        }
        return scanner.nextInt();
    }

    public static void sorting (int number, List<Product> productList){
        if (number == 0){
            System.out.println("----------- Comparator By Price Ascending ---------------");
            Collections.sort(productList, new ComparatorProductByPriceAscending());
        }if (number == 1){
            System.out.println("----------- Comparator By Price Descending ---------------");
            Collections.sort(productList, new ComparatorProductByPriceDescending());
        }if (number == 2){
            System.out.println("----------- Comparator By Rating ---------------");
            Collections.sort(productList, new ComparatorProductByRating());
        }if (number == 3){
            System.out.println("----------- Comparator By Quantity ---------------");
            Collections.sort(productList, new ComparatorProductByQuantity());
        }
        ProductUtil.printListProduct(productList);
    }
}