package org.example;




abstract public class Student implements LoanInterest {
	private String name;
	private String studNum;
	private double loanAmount;

    public Student() {

    }

    public Student(String nm, String num, double amt) {
    	name = nm;
    	studNum = num;
    	loanAmount = amt;
    }

    public double getLoanAmount(){
    	return loanAmount;
    }

    public String toString(){
    	return "Name of student: " + name + "\n" +
    			"Student number: " + studNum + "\n" +
    			"Loan amount: " + loanAmount;
    }
}