package day36_bigtasks;

import java.util.ArrayList;

/*
 E) 	Create a class called UsingCanvas in your Practice_Programming project and inside the da36_tasks package



        Task:
		- Create an object of Canvas and verify all the fields and methods can be accessed and used



 */
public class UsingCanvas {
    public static void main(String[] args) {

        App a1 = new App("Apple", 52, 100);
        System.out.println(a1);

        File f1 = new File(".png file", 66 );
        System.out.println(f1);

        ArrayList<File> File1 = new ArrayList();
        File1.add(f1);
        Module a2 = new Module(File1);
        System.out.println(a2);
        ArrayList<File> filesForModule2 = new ArrayList<>();
        filesForModule2.add(f1);
        Module module2 = new Module(filesForModule2);

        // Create Canvas with no initial quizzes or modules
        Canvas canvas1 = new Canvas("Java Programming");
        canvas1.addApps(a1);


        // Print canvas details
        System.out.println(canvas1);


    }
}
