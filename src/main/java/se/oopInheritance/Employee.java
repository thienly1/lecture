package se.oopInheritance;

import java.time.LocalDate;

//Person is a super class of Employee
public class Employee extends Person {
    private double salary;
    private LocalDate hiredDate;

    public Employee(String name, LocalDate birthDate, double salary, LocalDate hiredDate) {
        super(name, birthDate);
        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hiredDate=" + hiredDate +
                '}';
    }
}
