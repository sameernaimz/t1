package day36_tasks;
/*
 F) 	Create a class called CheckSeason in your Practice_Programming project and inside the da36_tasks package



        Task:
		- Create objects of Winter, Summer, Fall and Spring in main method and verify if constructor, toString(), and activity() are working properly for each class

		- List the is a relations of all the classes

 */
public class CheckSeason {
    public static void main(String[] args) {
        Winter w1 = new Winter("Winter", 65, -2);
        System.out.println(w1);
        w1.activity();

        Summer s = new Summer("Summer", 105, 67);
        System.out.println(s);
        s.activity();

        Fall f1 = new Fall("Fall", 91, 45);
        System.out.println(f1);
        f1.activity();

        Spring s1 = new Spring( 94, 62);
        System.out.println(s1);
        s1.activity();
    }
}
