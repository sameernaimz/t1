package day36_bigtasks;

import java.util.ArrayList;

/*
C) Create a Module called App in your Practice_Programming project and inside the day36_big_tasks package


        Task:

		- data/create instance variables/attributes:
			- files (ArrayList of File objects)

		- constructor:
			- no parameter -> create empty ArrayList object
			- initialize with given ArrayList of Files
				-> Use chaining


	    	- create method:
			- toString: print all the quiz information
			- addFile(File): accept a File object and add the given File to the ArrayList of Files of that module
			- removeFile(File): accepts a File object and remove the given File from the ArrayList of Files of that module


 */
public class Module {
    ArrayList<File> files;
    public Module() {
        this.files = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }

    public Module (ArrayList<File> files ){
        this();
        this.files.addAll(files);


    }
    public void addFile(File file) {
        files.add(file);

    }
    public void removeFile(File file) {
        files.remove(file);
    }
}
