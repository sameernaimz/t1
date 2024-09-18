package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {
        //We cannot  re-assign this because the method is a VOID method, meaning it does not return anything back
        sayHello();

        String str = sayHello2(); // WE USED STRING SAY HELLO to return
        System.out.println(str);

        System.out.println(sayHello2()); //SAME STRING RETURN

    }

    public static void sayHello () {
        System.out.println("Hello");
    }

    public static String  sayHello2 () {
        String result = "Hello";
        return result;

    }
}
