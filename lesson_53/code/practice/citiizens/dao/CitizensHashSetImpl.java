package practice.citiizens.dao;
//       Имплементация Citizens на HashSet, в сравнении с реализацией на TreeSet, имеет несколько отличий:

//       1. Отсутствие сортировки:
//        HashSet: Элементы в HashSet не упорядочены. Операции добавления, удаления и поиска работают быстро, но порядок элементов не гарантирован.
//        TreeSet: В TreeSet элементы автоматически сортируются, что обеспечивает упорядоченный доступ к данным.
//
//       2.Производительность операций:
//        HashSet: Операции добавления, удаления и поиска обычно выполняются быстрее в среднем случае (O(1)), но нет гарантированной сложности.
//        TreeSet: Операции в TreeSet могут быть медленнее в худшем случае (O(log n)), но они гарантированно выполняются за логарифмическое время из-за сортировки.
//
//       3. Неявное сравнение:
//        HashSet: Сравнение элементов в HashSet происходит неявно с использованием хэш-кодов. Это может привести к коллизиям, когда разные объекты имеют одинаковый хэш-код.
//        TreeSet: Сравнение элементов в TreeSet происходит явно через методы сравнения, что может быть более надежным.
//
//        4. Уникальность элементов:
//        HashSet: Гарантирует уникальность элементов на основе хэш-кодов.
//        TreeSet: Гарантирует уникальность элементов и поддерживает их сортировку.

//        Выводы:
//        Использование HashSet может быть предпочтительным, если важна быстрая производительность операций и порядок элементов не имеет значения.
//
//        TreeSet подходит, если требуется упорядоченный доступ к элементам и гарантированная сортировка данных.
//
//        Выбор между HashSet и TreeSet зависит от конкретных требований приложения и предпочтений по производительности.

import practice.citiizens.model.Person;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CitizensHashSetImpl implements  Citizens {
    private HashSet<Person> idList;

    private HashSet<Person> lastNameList;

    private HashSet<Person> ageList;

    private static Comparator<Person> lastNameComparator = (p1, p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName());// сортировка по алфавиту по фамилиям
        return res  != 0 ? res : Integer.compare(p1.getId(), p2.getId());// дополнительно по id

    };
    private static Comparator<Person> ageComparator = (p1,p2) ->{
        int res = Integer.compare(p1.getAge(), p2.getAge());//сортировка по кол-ву лет
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getAge());// дополнительно по id
    };
    public CitizensHashSetImpl(){
        idList = new HashSet<>();
        lastNameList = new HashSet<>();
        ageList = new HashSet<>();


    }
    public CitizensHashSetImpl(List<Person> citizens){
        this();
        for (Person person : citizens){
             add(person);
        }

    }



    @Override
    public boolean add(Person person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    @Override
    public boolean remove(int id) {
        Person person = find(id);
        return person != null && idList.remove(person) && lastNameList.remove(person) && ageList.remove(person);
    }

    @Override
    public Person find(int id) {
        for (Person person : idList){
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {


        return null;
    }

    @Override
    public Iterable<Person> find(String LastName) {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
