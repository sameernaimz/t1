package day35_tasks.App;
/*
C) 	Create a class called Youtube in your Practice_Programming project and inside the da35_tasks package
	NOTE: Youtube class inherits App class


        Task:

		- create constructor to call parent constructor and set up variables (name and version)



	    	- create method:
        		watchVideo()
            			Example output: prints Watching java tutorial
*/

public class Youtube extends App {

    public Youtube(String name, String version) {
        super(name, version);
    }


    public void watchVideo() {
        System.out.println("watching java tutorial");
    }
}
