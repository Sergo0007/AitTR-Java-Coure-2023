package recursion;
//		Алгоритм Евклида — это эффективный метод для нахождения наибольшего общего делителя (НОД) двух чисел.
//		Он основан на простой идее: НОД двух чисел не изменится, если большее число заменить на разность между ним
//		и меньшим числом.

public class EuclidGCD {
    public static void main(String[] args) {

        int m = 17;
        int n = 19;

        int res = greatCommonDivision(n,m);
        System.out.println("GCD = " + res);

    }

    private static int greatCommonDivision(int n, int m) {
        //Euclid algorithm
        if ( n == m){
            return n;
        }
        if (n > m){
            return greatCommonDivision(n - m,m);
        }else {
            //m > n
            return greatCommonDivision(n, m - n);
        }
    }


}
