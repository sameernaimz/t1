package day36_tasks;
/*
   D) 	Create a class called Fall in your Practice_Programming project and inside the da36_tasks package
	NOTE: Fall class inherits Season class


        Task:

		- create constructor to call parent constructor and set the values to variables


	    	- create method:
        		activity(): Read A Book
 */
public class Fall extends Season {
    public Fall(String name, double highestAverageTemperature, double lowestAverageTemperature) {
        super(name, highestAverageTemperature, lowestAverageTemperature);

    }
    public void activity() {
        System.out.println("Reading a book");
    }
}
