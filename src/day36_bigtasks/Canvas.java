package day36_bigtasks;

import java.util.ArrayList;

/*
 D) Create a Canvas called App in your Practice_Programming project and inside the day36_big_tasks package


        Task:

		- data/create instance variables/attributes:
			- topic (String)
			- quizzes (ArrayList of Quiz objects)
			- modules (ArrayList of Module objects)

		- constructor:
			- initialize topic
				-> create empty ArrayList objects for quizzes and modules
			- overload to accept the ArrayList of Quizzes and ArrayList of Module
				+ chain the constructors

	    	- create method:
			- toString: print all the quiz information
			- addFile(File): accept a File object and add the given File to the ArrayList of Files of that module
			- removeFile(File): accepts a File object and remove the given File from the ArrayList of Files of that module


 */
public class Canvas {
  String topic;
  ArrayList<App> Apps;
  ArrayList<Module> Modules;


  public Canvas(String topic) {
    this.topic = topic;
    this.Apps = new ArrayList<>();
    this.Modules = new ArrayList<>();

  }

  public Canvas(String topic, ArrayList<App> apps, ArrayList<Module> modules) {
    this.topic = topic;
   this.Apps.addAll(apps);
   this.Modules.addAll(modules);
  }

  public void addApps (App app) {
    Apps.add(app);

  }
  public void addModules (Module module) {
    Modules.add(module);
  }
}
