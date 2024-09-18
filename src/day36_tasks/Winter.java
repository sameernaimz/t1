package day36_tasks;
/*
    B) 	Create a class called Winter in your Practice_Programming project and inside the da36_tasks package
	NOTE: Winter class inherits Season class


        Task:

		- create constructor to call parent constructor and set the values to variables



	    	- create method:
        		activity(): Print "Use Fireplace"

 */
public class Winter extends Season {
    public Winter(String name, double highestAverageTemperature, double lowestAverageTemperature) {
        super(name, highestAverageTemperature, lowestAverageTemperature);
    }

    public void activity() {
        System.out.println("USING FIREPLACE");
    }
}

