public interface MyList {
    boolean add(String element);
    boolean add(String element, int index);
    String get(int index);
    int size();
    String remove(int index); // удоляет элемент и возвращает удоленный элемент
    String remove(); // удоляет элемент и возвращает удоленный элемент
    String set(int index, String element);


}
