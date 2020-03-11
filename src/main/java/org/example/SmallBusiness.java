package org.example;


public class SmallBusiness implements LoanInterest {
	private String name;
	private String registerNum;
	private double loanAmount;

    public SmallBusiness() {

    }

     public SmallBusiness(String nm, String regnum, double amt) {
    	name = nm;
    	registerNum = regnum;
    	loanAmount = amt;

    }

    public String toString(){
    	return "Business name: " + name + "\n" +
    			"Register number: " + registerNum + "\n" +
    			"Loan amount: " + loanAmount;
    }

    public double interest(){
			return loanAmount * 15/100;
    }


}