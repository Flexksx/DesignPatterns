package employees;

import java.util.HashSet;

import javax.annotation.Nullable;

public class Accountant implements Employee {
    private String name;
    private double salary;
    @Nullable
    private HashSet<Employee> subordinates;

    public Accountant(String name, double salary, HashSet<Employee> subordinates) {
        this.name = name;
        this.salary = salary;
        if (subordinates == null) {
            this.subordinates = new HashSet<>(); // Use HashSet to allow modifications
        } else {
            this.subordinates = new HashSet<>(subordinates); // Make sure it's mutable
        }
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public HashSet<Employee> getSubordinates() {
        return this.subordinates;
    }

    public void setSubordinates(HashSet<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee employee) {
        this.subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        this.subordinates.remove(employee);
    }

    private void paySalariesTo(Employee employee) {
        System.out.println("Paying " + employee.getName() + " $" + employee.getSalary());
    }

    @Override
    public void work() {
        System.out.println("I'm an accountant, I'm working");
        for (Employee employee : this.subordinates) {
            paySalariesTo(employee);
        }
        System.out.println("Paying myself $" + this.salary);
    }

}
