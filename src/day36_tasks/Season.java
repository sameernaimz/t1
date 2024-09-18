package day36_tasks;
/*
Tasks 2 - Create multiple classes

    A) Create a class called Season in your Practice_Programming project and inside the da36_tasks package


        Task:

		- data/create instance variables:
			- name (String)
			- highest average temperature
			- lowest average temperature




		- create constructor to initialize the variables/fields/attributes



	    	- create method:
			- activity()  ---- > override activity in sub classes
			- toString()
 */
public class Season {
    String name;
    double highestAverageTemperature;
    double lowestAverageTemperature;
    public Season (String name, double highestAverageTemperature, double lowestAverageTemperature) {
        this.name = name;
        this.highestAverageTemperature = highestAverageTemperature;
        this.lowestAverageTemperature = lowestAverageTemperature;

    }
    public void activity() {

    }

    @Override
    public String toString() {
        return "Season" +
                "\n\tname\t" + name +
                "\n\thighestAverageTemperature\t" + highestAverageTemperature +
                "\n\tlowestAverageTemperature\t" + lowestAverageTemperature ;
    }
}
