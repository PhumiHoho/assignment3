package org.example;
import java.util.*;
public class MainLoanInterest {


    public static void main(String[] args) {
      Student students1 = new UnderGrad("Phumi","Hoho",20000.00);
      Student students2 = new PostGrad("Kaylin","Morkel",30000.00);

      LoanInterest[] loanArray = new LoanInterest[2];
      loanArray[0] = students1;
      loanArray[1] = students2;

      for(int i = 0; i < loanArray.length; i++){
      	    System.out.println(loanArray[i].toString() + "\n");
      	    System.out.println("Interest: " + loanArray[i].interest());

      }



    }
}
