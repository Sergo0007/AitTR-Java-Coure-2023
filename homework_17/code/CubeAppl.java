public class CubeAppl {
    public static void main(String[] args) {
        System.out.println("Куб раз: ");
        Cube cube1 = new Cube(2);
        cube1.display();
        cube1.split();

        System.out.println("Куб два: ");
        Cube cube2 = new Cube(4);
        cube2.display();
        cube2.split();

        System.out.println("Куб три: ");
        Cube cube3 = new Cube(3);
        cube3.display();
        cube3.split();

    }
}