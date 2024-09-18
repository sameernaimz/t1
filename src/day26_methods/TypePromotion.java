package day26_methods;

public class TypePromotion {
    public static void main(String[] args) {

        use(5L);
        use(3);
        use(1.2f);
        use(3.5);
        use((double)3); // use(3.0);


        use((byte) 3);
    }
    //byte, short, int, long, float, ---- float, double

    public static void use (float f) {
        System.out.println("Calling float method");
    }

    public static void use (double d) {
        System.out.println("Calling double method");
    }

    public static void use (long l) {
        System.out.println("calling long method");
    }


    public static void use (byte b) {
        System.out.println("calling byte method");
    }
}
