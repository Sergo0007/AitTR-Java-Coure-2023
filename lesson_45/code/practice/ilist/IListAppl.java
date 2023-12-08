package practice.ilist;

public class IListAppl {
    public static void main(String[] args) {
        //список с целыми числами
        IList2<Integer> List = new IListImpl<>();
        System.out.println(List.size());
        System.out.println(List.isEmpty());

        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        System.out.println(List.size());
        System.out.println(List.isEmpty());
        System.out.println("---------------");
        System.out.println(List.indexOf(30));

        System.out.println("---------------");

        IList2<String> ListOfCities = new IListImpl<>();
        ListOfCities.add("Berlin");
        ListOfCities.add("Kiel");
        ListOfCities.add("Brondby");
        ListOfCities.add("Suderbraup");

        //...
        System.out.println(ListOfCities.size());
        System.out.println(ListOfCities.isEmpty());














        //список данных типа String
        IList2<String> city = new IListImpl<>();
        System.out.println("---------------------");
        city.add("Frunze");
        city.add("Kaliningrad");
        city.add("Och");
        city.add("Kappeln");
        city.add("Lubeck");
        System.out.println(city.size());
        System.out.println(city.isEmpty());

        for (int i = 0; i < city.size(); i++) {
            System.out.print(city.get(i) + ", ");


        }
        System.out.println("------------------");
        for (String s : city){
            System.out.print(s + " | ");
        }
    }
}
