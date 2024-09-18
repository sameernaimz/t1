package day36_bigtasks;
/*

Note: Advance Class & Object Practice (Big Task – No Encapsulation or Inheritance)

Tasks 1 - Create multiple classes

    A) Create a Quiz called App in your Practice_Programming project and inside the day36_big_tasks package


        Task:

		- data/create instance variables/attributes:
			- topic (String)
			- total number of questions (int)
			- total points (double)


		- constructor:
			- initialize all variables



	    	- create method:
			- toString: print all the quiz information
			- takeQuiz(): print: Taking the $topic quiz

 */
public class App {
    String topic;
    int totalQuestions;
    double totalPoints;

    public App(String topic, int totalQuestions, double totalPoints) {
        this.topic = topic;
        this.totalQuestions = totalQuestions;
        this.totalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "App{" +
                "topic='" + topic + '\'' +
                ", totalQuestions=" + totalQuestions +
                ", totalPoints=" + totalPoints +
                '}';
    }

    public void takeQuiz() {
        System.out.println("Taking the" + topic + "QUIZ");
    }
}
