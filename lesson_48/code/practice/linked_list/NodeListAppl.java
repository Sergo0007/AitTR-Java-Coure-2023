package practice.linked_list;

public class NodeListAppl {
    public static void main(String[] args) {

        //создадим список из целых чисел

        NodeListImpl<Integer> listNumbers = new NodeListImpl<>();
        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        listNumbers.add(100);
        listNumbers.add(200);
        listNumbers.add(300);
        listNumbers.add(400);

        System.out.println(listNumbers.size());
        System.out.println(listNumbers.isEmpty());

        for (Integer n : listNumbers){
            System.out.print(n + ", ");
        }
        System.out.println();

        //вставить 250 под индексом 2
        listNumbers.add(2,250);
        for (Integer n : listNumbers){
            System.out.print(n + ", ");
        }
        System.out.println();

        //удалим узел 300 по индексу 3
        listNumbers.remove(3);
        for (Integer n : listNumbers) {
            System.out.println(n + ", ");
        }
        System.out.println();

        //добавим null
        listNumbers.add(2,null);
        for (Integer n : listNumbers){
            System.out.println(n + ", ");
        }
        System.out.println();
        //создаем список из строк
    }
}
