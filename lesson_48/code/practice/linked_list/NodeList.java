package practice.linked_list;
//2

public interface NodeList<E> extends Iterable<E> {
    //прописываем методы

    int size();//размер листа

    default boolean isEmpty() {
        return size() == 0;
    }

    boolean add(E element);//добавление

    void clear();//зачистка

    default boolean contains(Object o) {
        return indexOf(o) >= 0;// есть ли такой объект

    }

    default boolean remove(Object o)//
    {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        }

        remove(index);
        return true;
    }

    boolean add(int index, E element);//добавить на место по индексу

    E get(int index);//получение элемента по индексу

    int indexOf(Object o);//определение индекса элемента в листе(cписке)

    int lastIndexOf(Object o);//

    E remove(int index); //удаление из листа узла по его индексу(номеру)

    E set(int index, E element);//


}
