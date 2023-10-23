public class Cub {
    public static void main(String[] args) {
        int s = cubeSurfaceSquare(10);//формула S = 6*a*a
        System.out.println("Square surface cube: = " + s);

        System.out.println("var2");

        double s1 = 6 * 0.5 * 0.5;
        cubeSurface(s1);
    }

    public static int cubeSurfaceSquare(int edge) {
        int surface = 6 * edge * edge;
        return surface;

    }

    public static void cubeSurface(double surface) {
        System.out.println("Surface cube: = " + surface);

    }
}