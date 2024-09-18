package day37_tasks;
/*

Tasks 1 - Create multiple classes

    A) Create a abstract class called Shopping in your Practice_Programming project and inside the da37_tasks package


        Task:


	    	- create 2 abstract method:
        		buyItem(),
			returnItem()







    B) 	Create a abstract class Target in your Practice_Programming project and inside the da37_tasks package
		NOTE:
			Make this class final
			Inherit Shopping and implement all abstract methods


        Task:

	    	- create method:
        		implement all abstract methods


 */
public class Chef extends Employee {

    public Chef(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }
        @Override
        public void work() {
            System.out.println("Chef is cooking  3 course meal");

        }
        @Override
        public void hobby() {
        System.out.println("Trying new food");

    }
}
