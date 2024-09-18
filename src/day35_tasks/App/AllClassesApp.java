package day35_tasks.App;

import java.sql.SQLOutput;

/*
   D) 	Create a class called AllClassesApp in your Practice_Programming project and inside the da35_tasks package



        Task:
		- Create objects of all three in main method to see which variables and methods each object has access to
 */
public class AllClassesApp {
    public static void main(String[] args) {
        App ap1 = new App("Shooter US","v4.0");
        System.out.println(ap1.name);
        System.out.println(ap1.version);
        System.out.println(ap1);
        ap1.download();
        System.out.println("-----------------------");




        Instagram in1 = new Instagram("InstaMain", "Unknown");
        System.out.println(in1.name);
        System.out.println(in1.version);
        System.out.println(in1);
        in1.postPicture();
        System.out.println("---------------");


        Youtube y1 = new Youtube("BroCode", "1.1");
        System.out.println(y1.name);
        System.out.println(y1.version);
        System.out.println(y1);
        y1.watchVideo();





    }
}
