package practice.linked_list;

import java.util.Iterator;

//3
public class NodeListImpl<E> implements NodeList<E> {
    //fields
    private Node<E> first;
    private Node<E> last;
    private int size;

    //O(1)
    @Override
    public int size() {
        return size;
    }
    //O(1)
    @Override
    public boolean add(E element) {//добавляем элемент в список
        Node<E> newNode = new Node<>(last, element, null);// создаем новый, следующий узел, последний
        if (last != null) {
            last.next = newNode;
        } else {
            first = newNode;//если список был пустой, то новый создаваемый становится первым
        }
        last = newNode;
        size++;
        return true;
        //узел новый, следующий в конец списка

    }
    //O(1)
    @Override
    public void clear() {

        first = last = null;
        size = 0;


    }
    //O(n)
    @Override
    public boolean add(int index, E element) {
        if (index == size) {//добавление элемента в конец
            return add(element);
        }
        Node<E> node = getNodeByIndex(index);//берем узел по его индексу
        Node<E> newNode = new Node<>(node.prev, element, node);//создаем новый узел для вставки в список
        node.prev = newNode;
        if (index != 0) {
            newNode.prev.next = newNode;
        } else {
            first = newNode;//вставка в начало списка
        }
        size++;
        return true;

    }

    //Как работает метод разобраться.
    /*Данный метод `getNodeByIndex` предназначен для получения узла (Node) с заданным индексом в
     связанном списке.  1. `checkIndex(index);`
     - Этот фрагмент кода используется для проверки корректности значения `index`. Этот метод,
      вероятно, проверяет, находится ли `index` в пределах допустимых границ, чтобы избежать
      ошибок выхода за пределы диапазона. 2. `if (index < size / 2)  - Этот блок выполняется,
       если индекс находится в первой половине списка. В этом случае начиная с начального узла
        `first`, метод перебирает узлы списка до достижения узла с соответствующим индексом. 3.
        `node = first;` - Этот код устанавливает начальное значение `node` в первый узел списка. 4.
        `for (int i = 0; i < index; i++) { node = node.next; }` - В этом цикле происходит итерация
        по узлам списка до достижения узла с индексом `index`. При каждой итерации `node`
        устанавливается в следующий узел. 5. `else { ... }` - Этот блок выполняется, если индекс
        находится во второй половине списка. В этом случае начиная с конечного узла `last`,
         метод перебирает узлы списка в обратном направлении до достижения узла с соответствующим индексом. 6.
         `node = last;` - Этот код устанавливает начальное значение `node` в последний узел списка. 7.
         `for (int i = size - 1; i > index; i--) { node = node.prev; }` - В этом цикле происходит итерация по
          узлам списка в обратном направлении до достижения узла с индексом `index`. При каждой итерации
          `node` устанавливается в предыдущий узел. 8. `return node;` - После выполнения одного из блоков
          кода, содержащих циклы, метод возвращает узел с заданным индексом. Таким образом,
           метод `getNodeByIndex` позволяет получить узел в связанном списке по заданному индексу,
            пройдясь от начала или конца списка в зависимости от индекса.
   //O(n)
     */
    private Node<E> getNodeByIndex(int index) {
        checkIndex(index);
        Node<E> node;
        if (index < size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;

    }
    //O(1)

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }
    //O(n)
    @Override
    public E get(int index) {
        Node<E> node = getNodeByIndex(index);
        return node.data;

    }
   //O(n)
    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o != null) {//внутри узла не null
            for (Node<E> node = first; node != null; node = node.next, index++) {//цикл перебирает узлы
                if (o.equals(node.data)) {
                    return index;
                }
            }
        } else {//внутри узла null
            for (Node<E> node = first; node != null; node = node.next, index++) {
                if (o == node.data) {//null можно сравнивать через ==
                    return index;
                }
            }
        }
        return -1;//объект о не найден в списке

    }
    //O(n)
    @Override
    public int lastIndexOf(Object o) {
        //TODO
        return 0;
    }
   //O(n)
    @Override
    public E remove(int index) {
        Node<E> node = getNodeByIndex(index);
        return unlink(node);


    }
    //O(1)
    // разобраться самостоятельно, что делает метод
    /*
   1. Сначала метод присваивает поле data объекта node переменной victim.
   2. Затем он присваивает поля prev и next объекта node переменным prev и next соответственно.
   3. Если переменная prev не равна null, она устанавливает поле next объекта prev в переменную next. Он также устанавливает поле prev объекта node в null.
   4. Если переменная next не равна null, она устанавливает поле prev объекта next в переменную prev. Он также устанавливает поле next объекта node в null.
   5. Если переменная prev равна null, она устанавливает поле first связного списка в переменную next.
   6. Если переменная next равна null, она устанавливает поле last связного списка в переменную prev.
   7. Затем он устанавливает поле data объекта node в null.
   8. Наконец, он уменьшает поле size связного списка и возвращает переменную victim.
    Надеюсь, эта пояснительная записка поможет! Дайте мне знать, если у вас есть дополнительные вопросы.
     */
    private E unlink(Node<E> node) {
        E victim = node.data;
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        if (prev != null) {
            prev.next = next;
            node.prev = null;
        } else {
            first = next;
        }
        if (next != null) {
            next.prev = prev;
            node.next = null;
        } else {
            last = prev;
        }
        node.data = null;
        size--;
        return victim;

    }
    //O(n)
    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);//нашли индекс по индексу
        E victim = node.data;
        node.data = element;//обновили данные
        return victim;

    }
    //O(1)
    @Override
    public Iterator<E> iterator() {


        return new Iterator<E>() {
            Node<E> current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}
