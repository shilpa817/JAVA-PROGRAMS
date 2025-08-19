package cseproject1;
import java.util.*;
interface RBI 
{
    public void deposite();
    public void withdraw();
     public void showbalance();
}
 class bank1 implements  RBI
{
	 private  int balance;
	 
	 public bank1(int balance)
	 {
		 this.balance=balance;
	 }
	 
	public void deposite()
	{
		double amount=1000;
		if(amount>0)
		{
			balance+=amount;
			System.out.println("deposited amount:"+amount);
			System.out.println("balance"+balance);
		}
		
		else
		{
			System.out.println("deposite must be positive:");
		}
	}
	public void withdraw()
	{
		int amount=500;
		if(amount>0 && amount<=balance)
		{ 
			balance-=amount;
			System.out.println("withdraw amount:"+amount);
			System.out.println("balance:"+balance);
		}
		else
		{
		    System.out.println("insufficient amount");
		}
	}
    public void showbalance()
	{
		System.out.print("showbalance:"+balance);
	}
}

public class bank
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter balance");
		int balance=sc.nextInt();
	    bank1 b1;
	    b1=new bank1(balance);
		b1.deposite();
		b1.withdraw();
		b1.showbalance();
	}
}
