package day39_tasks;

import javax.swing.text.Element;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 E) 	Create a class called RunnerClass in your Practice_Programming project and inside the da39_tasks package



        Task:
		- Create objects of Link and Input with a focus on the interface references
Extra

bonus to try/think about:

    array or ArrayList of these objects that are similar looping those objects

 */
public class RunnerClass {
    public static void main(String[] args) {
        WebElement l1 = new Link();
        l1.click();
        l1.getText();
        l1.setText("\tKEYS HAVE BEEN SENT SUCCESSFULLY!");

        System.out.println("-----------------");

        WebElement l2 = new Input();
        l2.click();
        l2.getText();
        l2.setText("\tsending your keys ...");

        System.out.println("-----------------");

        WebDriverUtil l3 = new WebDriverUtil();
        l3.clickElement(l1);
        l3.clickElement(l2);

 ArrayList<WebElement> elements = new ArrayList<>();
 elements.add(l1);
 elements.add(l2);

     for (WebElement element : elements) {
         System.out.println(element.getText());


        }
    }
}

