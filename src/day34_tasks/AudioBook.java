package day34_tasks;

public class AudioBook extends Book {
    String duration;
    String narrator;

    public void listen() {
        System.out.println("listening to " + title + "narrated by " + narrator);
    }

}
