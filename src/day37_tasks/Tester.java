package day37_tasks;
/*

    C) 	Create a class called Tester in your Practice_Programming project and inside the da37_tasks package
	NOTE: This class inherits Employee class


        Task:



	    	- implement hobby() and work() methods
    			hobby(): create a print statement for your own hobbies

    			work(): Running test cases
 */
public class Tester extends Employee {

    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    @Override
    public void hobby() {
        System.out.println("MY HOBBY IS WATCHING TV");
    }
}
