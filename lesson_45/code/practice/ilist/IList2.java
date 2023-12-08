package practice.ilist;
//1 side
//задаем абстрактные методы для работы со структурой данных "List" (список чего-то)
// для любых типов данных  Integer,String,StringBuilder,Employee,Car,Pet,Photo,Book....

public interface IList2<E> extends Iterable<E> {
    int size();//узнать размер списка

    default boolean isEmpty() {
        return size() == 0;
    } //есть ли что то в списке или он пустой

    void clean();//удалить все из списка

    boolean add(E element); //добавить элемент списка

    default boolean contains(Object o)//есть ли элемент в списке
    {
        return indexOf(o) >= 0;


    }

    default boolean remove(Object o) //удалить элемент, если он есть(а все ли элементы мы удалим?)
    {
        int index = indexOf(o);
        if (index < 0) {//
            return false;
        }
        remove(index);
        return true;
    }

    boolean add(int index, E element); //добавить (вставить) элемент по индексу


    E get(int index); //получить элемент по его индексу


    E remove(int index); //удалить элемент из списка по индексу

    E set(int index,E element);//обновить элемент в списке по его индексу


    int indexOf(Object o);//зная элемент, найти его индекс


    int lastIndexOf(Object o);//ищем индекс элемента с конца списка

}
