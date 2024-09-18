package day32_tasks;

public class Hobby {
    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this.name = name;
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {

        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;

    }
        public void dolt() {
            if (isOutdoors = true) {
                System.out.println("doing" + name + "OUTSIDE");
            } else {
                System.out.println("doing" + name + "INSIDE");
            }
        }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}


