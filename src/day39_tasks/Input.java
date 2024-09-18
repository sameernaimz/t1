package day39_tasks;
/*

    C) Create a class called Input in your Practice_Programming project and inside the da39_tasks package


        Task:

- implement the WebElement interface

- implement all abstract methods

 */
public class Input implements WebElement {


    @Override
    public void click() {
        System.out.println("clicking input button");
    }

    @Override
    public String getText() {
        return "getting input text please wait";
    }

    @Override
    public void setText(String text) {
        System.out.println("getting input keys please wait" + text);
    }
}
