package day38_tasks;
/*
 C) 	Create an abstract class called EBook in your Practice_Programming project and inside the da38_tasks package
	NOTE: This class inherits Book and implements Downloadable


        Task:

		- Declare a size variable


	   	- Declare an abstract methods:
        		open()
 */
public abstract class Ebook extends Book implements Downloadable {

    double size;

    public abstract void open();


}
