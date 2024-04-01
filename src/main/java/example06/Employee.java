package example06;

public class Employee implements Workable{
    private String name;
    private double salary;
    public void updateName(String name){
        this.name = name;
    }

    public double calculateSalary(double salary){
       return salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
