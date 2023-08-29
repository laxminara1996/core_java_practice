package in.lakshmi;

import java.io.BufferedReader;
import java.io.*;

public class BankDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("1. Money Deposit");
	      System.out.println("2. Money Withdraw");
	      System.out.println("3. Check Balance");
	      System.out.println("4. Stop the App");
	      System.out.println("enter the option:");
	      InputStreamReader isr = new InputStreamReader(System.in);
	      BufferedReader br = new BufferedReader(isr);
	      String str = br.readLine();
	      int num = Integer.parseInt(str);
	      Bank b;
	      b=new SubBank();
	      switch(num) {
	      case 1: 
	    	  System.out.println("enter the amount");
	    	  String strAmount = br.readLine();
	    	  int amount = Integer.parseInt(strAmount);
	    	  System.out.println("amount is :"+amount);
	    	  b.moneyDeposit(amount);
	    	  break;
	      case 2:
	    	  System.out.println("enter the Withdraw amount");
	    	  String withdrawAmount = br.readLine();
	    	  int wdamount = Integer.parseInt(withdrawAmount);
	    	  System.out.println("amount is :"+wdamount);
	    	  b.moneyWithdraw(wdamount);
	    	  break;
	      case 3:
	    	  b.checkBalance();
	    	  break;
	      case 4 :
	          break;
	      }
	      

	}

}
