package day34_tasks;

public class AllClassesEmployee extends Employee {
    public static void main(String[] args) {
      Employee emp1 = new Employee();
      emp1.name = "joel Rasteze";
      emp1.isFullTime = true;
      emp1.salary = 80_999;
      emp1.work();

      Tester test1 = new Tester();
      test1 .name = "Joe Goldberg";
        test1.isFullTime = true;
        test1.salary = 99_999;
      test1.bugsFound = 2;
      test1.work();
      test1.test();

      Developer dev1 = new Developer();
        dev1.name = "Marie Ann";
        dev1.isFullTime = false;
        dev1.salary = 102_999;
        dev1.features = "Multiple";
        dev1.develop();


    }
}
