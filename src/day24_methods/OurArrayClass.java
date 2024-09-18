package day24_methods;
/*

    all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the element/s
        length matters -> if even there are two middle, for odd there is one middle

 */
public class OurArrayClass {
public static void firstArrElem (int [] arr) {
    System.out.println("First element: " + arr[0]);
}
public static void  lastArrElem (int [] arr) {
    System.out.println("Last element: " + arr[arr.length-1]);
}

public static void arrMidElem (int [] arr) {
    if (arr.length % 2 == 0) { // if length is EVEN
        System.out.println("Middle First:" + arr[arr.length/2-1]);
        System.out.println("MIDDLE SECOND:" + arr[arr.length/2]);
    } else {
        System.out.println("Middle: " + arr[arr.length/2]);
    }
}
    public static void main(String[] args) {

        int [] numbers = {10, 2, 4, 765, 23, 0, 2344};
        int [] numbers2 = {1034, 23452, 234, 331, 2234, 0, 54};
        int []  numbers3 = new int[3];
        int [] numbers4 = {1034, 23452, 234, 331, 2234, 0, 54};
        int []  numbers5 = {1034, 23452, 234, 331, 2234, 0, 54, 65};
        firstArrElem(numbers);
        lastArrElem(numbers);

        System.out.println();
        firstArrElem(numbers2);
        lastArrElem(numbers2);

        System.out.println();
        firstArrElem(numbers3);
        lastArrElem(numbers3);

        System.out.println();
        arrMidElem(numbers4);
        arrMidElem(numbers5);

    }
}
