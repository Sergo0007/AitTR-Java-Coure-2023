public class Shapes {
    public static void main(String[] args) {
        int v = cubeEdgeLength(5);//формула V = a*a*a,V это обьем куба ,"a" длина ребра куба.
        System.out.println("Square cube: = " + v);
        double s = definitionHeightTriangle(5.5, 9.5);//формула S=a*h/2
        System.out.println("Square triangle: = " + s);
    }

    public static int cubeEdgeLength(int edge) {
        return edge * edge * edge;
    }

    public static double definitionHeightTriangle(double definition, double height) {
        return definition * height / 2;
    }
}




