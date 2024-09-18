package day35_tasks.App;
/*
A) Create a class called App in your Practice_Programming project and inside the da35_tasks package


        Task:

		- data/create instance variables:
			name (app name), version


    		- create constructor to initialize the variables


	    	- create method:
        		download()
            			Example output: prints $name is downloading version $version








    B) 	Create a class called Instagram in your Practice_Programming project and inside the da35_tasks package
	NOTE: Instagram class inherits App class


        Task:

		- create constructor to call parent constructor and set up variables (name and version)




	    	- create method:
        		postPicture()
            			Example output: prints Posting picture to Instagram











    C) 	Create a class called Youtube in your Practice_Programming project and inside the da35_tasks package
	NOTE: Youtube class inherits App class


        Task:

		- create constructor to call parent constructor and set up variables (name and version)



	    	- create method:
        		watchVideo()
            			Example output: prints Watching java tutorial






    D) 	Create a class called AllClassesApp in your Practice_Programming project and inside the da35_tasks package



        Task:
		- Create objects of all three in main method to see which variables and methods each object has access to

 */
public class App {
    String name;
    String version;

    public App(String name, String version) {
        this.name = name;
        this.version = version;
    }


    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public void download() {
            System.out.println(name + "is downloading version" + version);


        }
    }

