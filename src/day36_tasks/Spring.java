package day36_tasks;
/*
E) 	Create a class called Spring in your Practice_Programming project and inside the da36_tasks package
	NOTE: Spring class inherits Season class


        Task:

		- create constructor to call parent constructor and set the values to variables


	    	- create method:
        		activity(): Go Outside

 */
public class Spring extends Season {

    public Spring( double highestAverageTemperature, double lowestAverageTemperature) {
        super("Spring", highestAverageTemperature, lowestAverageTemperature);

    }
    public void activity() {
        System.out.println("Go outside");
    }
}
