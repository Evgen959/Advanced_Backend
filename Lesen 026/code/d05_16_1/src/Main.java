import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,4,-5,9,2,0,6));
        Collections.sort(list);
        System.out.println(list);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jack", 10));
        people.add(new Person("Jack", 10));
        people.add(new Person("Jack", 10));
        people.add(new Person("Jack", 10));
        people.add(new Person("Jack", 10));

        Person p1 = new Person("Igor", 32);
        Person p2 = new Person("Sveta", 30);

        System.out.println(p2.compareTo(p1));

        Collections.sort(people);
        System.out.println(people);


        List<Book> books = new ArrayList<>();
        books.add(new Book("Tolstoy", "Anna Karenina", 1990, 5.10));
        books.add(new Book("Tolstoy", "Voina i mir", 1998, 3.30));
        books.add(new Book("Tolstoy", "Anna Karenina", 1990, 5.10));
        books.add(new Book("Duma", "Koroleva Margo", 2010, 20.00));
        books.add(new Book("Pushkin", "Ruslan i Ludmila", 2005, 10.90));
        books.add(new Book("Lermontov", "Geroi nashego vremeni", 2008, 3.30));
        books.add(new Book("Goethe", "Faustr", 1970, 2.30));
        books.add(new Book("Goethe", "Faustr", 1975, 2.30));

        printBook(books);
        Collections.sort(books);
        System.out.println("---------------");
        printBook(books);
        System.out.println("----------- comparator by price --------------");
        Collections.sort(books, new CompoaratorBookByPrice());
        printBook(books);
        System.out.println("----------- comparator by year --------------");
        Collections.sort(books, new CompoaratorBookByYear());
        printBook(books);
        System.out.println("----------- comparator by Titlt Length --------------");
        Collections.sort(books, new CompoaratorBookByTitltLength());
        printBook(books);
    }
    public static  void printBook(List<Book> list){
        for (Book b : list) {
            System.out.println(b);
        }
    }






    // метод перемещения с ячейки в ячейку
    public static void swap(List<Integer> list, int index1, int index2){
        Integer temp = list.get(index1); // содержимое в ячейкн с индексом 1 ложем в темп
        list.set(index1, list.get(index2)); // с ячейки с идексом 2 ложем в ячейку с индексом 1
        list.set(index2, temp);// с темп в ячейку в индексом 2
    }
}