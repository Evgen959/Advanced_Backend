public interface MyList<E> {
    boolean add(E element);
    boolean add(int index, E element);
    E get(int index);
    int size();
    E remove(int index); // удоляет элемент и возвращает его
    E remove(); // удоляет элемент и возвращает его
    E set(int index, E element);


}
