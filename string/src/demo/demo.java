package demo;

import java.util.ArrayList;
import java.util.Scanner;

class Account {
	String username="";
	String accnum ="";
	  int addmoney=0;
	  int balance =0;
	 	

	
	public Account(String username, String accnum, int addmoney, int balance) {
		
		this.username = username;
		this.accnum = accnum;
		this.addmoney = addmoney;
		this.balance = balance;
		
	}
    
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public int getAddmoney() {
		return addmoney;
	}
	public void setAddmoney(int addmoney) {
		this.addmoney = addmoney;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "student username =" + username + ", accnum =" + accnum + ", addmoney =" + addmoney + ", balance ="
				+ balance + "";
	}

}



public class demo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Account> obj = new ArrayList<>();
		Scanner sc  = new Scanner(System.in);
		
		/*
		 * System.out.println("How Many Student Details add"); int n=sc.nextInt();
		 */
		
		for(int i=0;i<2;i++) {
		System.out.println("Enter you name :");
		String username = sc.next(); 
		System.out.println("Enter you AccNo");
		String accnum = sc.next();
		
		System.out.println("AddMoney in your Acc");
		int addmoney = sc.nextInt();
		
		int balance = 5000+addmoney;
		obj.add(new Account(username,accnum,addmoney,balance));
		
	}   
		System.out.println("Account details");
		for(Account std:obj) {
			System.out.println(std);
		}
		 
		
		
		
		
		
		
		

	}

}
