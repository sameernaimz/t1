package day26_methods;

public class OverloadAndReturn {

    public static void method () {
        System.out.println("empty method");
    }

    // I tried to overlqoad the method called "method" by changing only RETURN type
    //NOT ACCEPTABLE - BECAUSE RETURN TYPE HAS NO EFFECT ON METHOD OVERLOADING
//    public static int method () {
//        System.out.println("empty method");
//        return 0;
//    }

    public static int method(int a) {
        System.out.println("empty method");
        return 0;
    }
    /*
    METHOD OVERLOADING
    1. Method Name has to be Same
    2. Parameters
    a. has to be different number of parameters if all the parameters data type are same
          method (string str);
           method (string str, String str2);

    b. has to be different number of parameter
            method (String str);
            method(int num);

    c. has to be different order if the number of the parameters are same
          method (String str, int num);
           method (int num, String str);
     */
}
