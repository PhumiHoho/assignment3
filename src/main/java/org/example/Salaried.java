package org.example;

public class Salaried extends Employee
{
    private double salary;

    public Salaried(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public double pay()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Salary is " +  salary;
    }
}
