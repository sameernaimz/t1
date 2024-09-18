package day35_tasks.App;


/*
   B) 	Create a class called Instagram in your Practice_Programming project and inside the da35_tasks package
	NOTE: Instagram class inherits App class


        Task:

		- create constructor to call parent constructor and set up variables (name and version)




	    	- create method:
        		postPicture()
            			Example output: prints Posting picture to Instagram

 */
public class Instagram extends App {
    public Instagram(String name, String version) {
        super(name, version);
    }

    public void postPicture () {
        System.out.println("posting picture to instagram");

    }


}
