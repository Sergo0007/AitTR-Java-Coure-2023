public class Swap {
//    Задача 4.(*) Реализовать способ обмена значениями двух переменных целого типа,
//    не используя третьей переменной.В идеале написать метод swap(a, b).
public static void main(String[] args) {

    int a = 25;
    int b = 75;
    swap(a,b);

}

    public static  void  swap(int a,int b){
        a = a + b; //25 + 75 = 100
        b = a - b;// 100 - 75 = 25
        a = a - b;// 100 - 25 = 75
        System.out.println( "a = " + a); 
        System.out.println("b = " + b);

    }


}