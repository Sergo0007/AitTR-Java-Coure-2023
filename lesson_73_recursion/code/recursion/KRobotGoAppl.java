package recursion;
//сделать метод идущего робота
// на каждом шагу робот сообщает что он сделал шаг и должен проходить n шагов затем стоп

public class KRobotGoAppl {
    public static void main(String[] args) {


        int steps = 10;
        int count = 0;
        moveForward(steps,count);
        System.out.println("Mission complete!");


    }

    private static void moveForward(int steps , int count) {
        if (steps > 0) {
            count++;
            System.out.println("Robot делает " + count + " шаг, осталось " + steps + " шагов.");
            moveForward(steps - 1,count);

        }


    }
}