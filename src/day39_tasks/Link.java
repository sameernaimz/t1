package day39_tasks;
/*
 B) Create a class called Link in your Practice_Programming project and inside the da39_tasks package


        Task:

    - implement the WebElement interface

- implement all abstract methods


 */
public class Link implements  WebElement {


    @Override
    public void click() {
        System.out.println("Clicked Link");
    }

    @Override
    public String getText() {
        return ("getting Link");
    }

    @Override
    public void setText(String text) {
        System.out.println("Sending keys be patient " + text);
    }
}
