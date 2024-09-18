package day31_tasks;

public class Offer {
    String location;
    String company;
    double salary;
    int numberOfPto;

    public Offer(String location, String company) {
        this.location = location;
        this.company = company;

    }

    public Offer(String location, String company, double salary) {
        this.location = location;
        this.company = company;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, int numberOfPto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.numberOfPto = numberOfPto;

    }

    @Override
    public String toString() {
        return "Offer" +
                "\n\tlocation :" + location +
                "\n\tcompany :" + company +
                "\n\tsalary :" + salary +
                "\n\tnumberOfPto :" + numberOfPto ;
    }
}