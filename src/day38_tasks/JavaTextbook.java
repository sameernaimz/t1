package day38_tasks;
/*
 D) 	Create a concrete class called JavaTextbook in your Practice_Programming project and inside the da38_tasks package
	NOTE: This class inherits EBook class


        Task:

		- Declare a fun variable


	    	- Override all abstract methods

 */
public class JavaTextbook extends Ebook {
    String hello;

    @Override
    public void open() {
        System.out.println(" Java Textbook is Opening");
    }

    @Override
    public void read() {
        System.out.println("Reading Java Textbook");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java Book Online");

    }
}
