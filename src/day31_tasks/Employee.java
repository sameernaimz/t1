package day31_tasks;

public class Employee {
    String name;
    int id;
    String jobtitle;
    double salary;

    public Employee (String name , String jobTitle) {
        this.name = name;
        this.jobtitle = jobTitle;

    }

    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobtitle = jobTitle;
        this.salary = salary;


    }

    public void goToMeeting() {
        System.out.println(name + ":\tIS GOING TO MEETING!");

    }

    @Override
    public String toString() {
        return "Employee:" +
                "\n\tname :" + name +
                "\n\tid :" + id +
                "\n\tjobtitle :" + jobtitle +
                "\n\tsalary :" + salary ;
    }

}