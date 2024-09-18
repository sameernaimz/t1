package day37_tasks;
/*
 B) Create a abstract class Employee in your Practice_Programming project and inside the da37_tasks package
NOTE: This class inherits Person class


        Task:


- define variables:
 job title, salary



    - create abstract method:
        work()

- override the toString method
 */
public abstract class Employee extends Person {
   String job;
   String title;
   double salary;

   public Employee(String name, int age, String jobTitle, double salary) {
   this.name = name;
   this.age = age;
   this.job = jobTitle;
   this.salary = salary;

   }
      // Create abstract method work
   public abstract void work();

   @Override
   public String toString() {
      return "Employee{" +
              "job='" + job + '\'' +
              ", title='" + title + '\'' +
              ", salary=" + salary +
              '}';
   }
}
