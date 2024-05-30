public interface MyList {
    boolean add(String element);
    boolean add(int index, String element);
    String get(int index);
    int size();
    String remove(int index); // удоляет элемент и возвращает его
    String remove(); // удоляет элемент и возвращает его
    String set(int index, String element);


}
