/*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д. Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).

 */

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
            String str1= "hello";
            String str2= "java";
            System.out.printf("%s | %s | %s%n",str1,str2, str1);

         */

        Product p1 = new Product("Монитор", 179.99, 4.8, 10);
        List<Product> products = new ArrayList<>( List.of(
                new Product("Ноутбук", 2000, 4.8, 3),
                new Product("Наушники", 119.99, 4.4, 38),
                new Product("Стирольная машина", 840.50, 4.0, 1),
                new Product("Телевизор", 410.50, 4.8, 6),
                new Product("Ноутбук", 2100, 4.9, 8),
                p1
        )); // Ctrl + Alt + V
         ComparatorProduct[] comparators ={
           new ComparatorProductByPrice(),
           new ComparatorProductByQuantity(),
           new ComparatorProductByTitle()
         };

        ProductUtil.print(products);
        System.out.println("------------------------------------");

        ComparatorProduct menu = menu(comparators);
        Collections.sort(products,menu);
        ProductUtil.print(products);
    }

    public static ComparatorProduct menu(ComparatorProduct[] arrayComparators){
        System.out.println("Выберите вариант сортировки: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <arrayComparators.length ; i++) {
            System.out.printf("%d. %s%n",i+1,arrayComparators[i].getDescription());
        }
        int choice = scanner.nextInt()-1;
        if(choice>=0 && choice< arrayComparators.length){
            return arrayComparators[choice];
        }
        System.exit(0);
        return null;
    }
}