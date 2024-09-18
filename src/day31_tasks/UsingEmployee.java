package day31_tasks;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee Employee1 = new Employee("John Smith",  "QA");
        System.out.println(Employee1);


        Employee Employee2 = new Employee("Jacob Mendez", 96693, "Developer", 90000);

        System.out.println(Employee2);

        Employee1.goToMeeting();
        Employee2.goToMeeting();


    }
}