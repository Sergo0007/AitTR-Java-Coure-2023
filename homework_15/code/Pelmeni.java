public class Pelmeni {
    public static void main(String[] args) {

        int[] pelmeni = new int[30];
        Dumplings.fillArray(pelmeni,25,35);

        System.out.println("Вес пельменей: ");
        Dumplings.printArray(pelmeni);

        // Поиск счастливого пельменя
        int happyIndex = Dumplings.findHappyDumpling(pelmeni);

        if (happyIndex != -1) {
            System.out.println("\nСчастливый пельмень - Пельмень " + (happyIndex + 1));
        } else {
            System.out.println("\nСчастливый пельмень не найден");
        }


    }
}
