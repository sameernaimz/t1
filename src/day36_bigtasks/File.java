package day36_bigtasks;
/*

    B) Create a File called App in your Practice_Programming project and inside the day36_big_tasks package


        Task:

		- data/create instance variables/attributes:
			- name (String)
			- size (double)


		- constructor:
			- initialize all variables



	    	- create method:
			- toString: print all the quiz information
			- openFile(): print: Opening $fileName
 */
public class File {
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void OpenFile() {
        System.out.println("Opening file " + name);
    }
}
