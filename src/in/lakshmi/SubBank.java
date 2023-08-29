package in.lakshmi;

import java.io.*;

public class SubBank implements Bank {

	@Override
	public void moneyDeposit(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" deposit success message");
		System.out.println("Total Balance");
		System.out.println("Menu To choose the Options");	
	}
	@Override
	public void moneyWithdraw(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount+" withdraw success message");
		System.out.println("Total Balance");
		System.out.println("Menu To choose the Options");
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Total Balance");
		System.out.println("Menu To choose the Options");
	}

	@Override
	public void stopTheApp() {
		// TODO Auto-generated method stub
		System.out.println("stop application");
	}

	
    
}
