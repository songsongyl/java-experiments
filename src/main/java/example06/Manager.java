package example06;

public class Manager extends Employee{
    private int level;
    public Manager(String name, double salary, int level) {
        super(name, salary);
        this.level = level;
    }

    public double calculateSalary(double salary){
        return salary*level*0.8;
    }


}
