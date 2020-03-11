package org.example;

public class Hourly extends Employee
{
    private double rate;
    private double hours;


    public Hourly(String name, double rate, double hours)
    {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public double pay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Rate is " + rate + " and hours are " + hours;
    }
}
