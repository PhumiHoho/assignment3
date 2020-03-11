package org.example;



public class UnderGrad extends Student {

    public UnderGrad(String nm, String num, double amt)
    {
    	super(nm,num,amt);
    }

    public double interest(){
			return  super.getLoanAmount() * 12/100;
    }



}