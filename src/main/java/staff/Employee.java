package staff;

public abstract class Employee {

    String name;
    String niNumber;
    double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public Object getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public Double raiseSalary(double amount) {
        return salary += amount;
    }

    public Double payBonus () {
        return salary / 100;
    }


}
