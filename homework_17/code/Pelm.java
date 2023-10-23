
import java.util.Random;
public class Pelm {


    public static void main(String[] args) {

            int[] dumplings = new int[30];
            Random random = new Random();
            for (int i = 0; i < dumplings.length; i++) {
                dumplings[i] = random.nextInt(35 - 25 ) + 25;
            }
            int happyIndex = random.nextInt(dumplings.length);
            dumplings[happyIndex] += 15;

            System.out.println("Вес пельменей:");
            for (int i = 0; i < dumplings.length; i++) {
                System.out.println("Пельмень " + (i+1) + ": " + dumplings[i] + " грамм");
            }

            System.out.println("\nНаходим счастливый пельмень...");
            for (int i = 0; i < dumplings.length; i++) {
                if (dumplings[i] > 50) {
                    System.out.println("Счастливый пельмень - Пельмень " + (i+1));
                    break;

                }
            }
        }
    }


