package org.example;


public class PostGrad extends Student {

    public PostGrad(String nm, String num, double amt) {
		super(nm,num,amt);
    }

     public double interest(){
			return super.getLoanAmount() * 10/100;
    }



}