package org.example;

public class Person {

    //composition has-a relationship
    private Job job;
   
    public Person(){
        this.job=new Job();
        job.setSalary(1000);
    }
    public long getSalary() {
        return job.getSalary();
    }

}