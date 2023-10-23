public class Method {
    public static void main(String[] args) {
        orderAccepted();
        bakery();
        orderIsCompleted();

    }

    public static void orderAccepted() {
        System.out.println("Order accepted");
    }

    public static void bakery() {
        waiter();
        baker();
        security();
        deliveryman();

    }

    public static void orderIsCompleted() {
        System.out.println("Order is completed");

    }

    public static void waiter() {
        System.out.println("My name is Obama");
        System.out.println("I accept the order");
    }

    public static void baker() {
        System.out.println("My name is Tramp");
        System.out.println("I'm picking up a pizza ");
    }

    public static void security() {
        System.out.println("My name is Baden");
        System.out.println("I'm sleeping");
    }

    public static void deliveryman() {
        System.out.println("My name is X");
        System.out.println("i'm delivering the order");
    }

}
