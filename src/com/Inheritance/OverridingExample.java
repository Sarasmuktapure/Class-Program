package com.Inheritance;

class Banking
{
	protected void doTransaction()
	{
		System.out.println("Trnasaction done by being in queue in bank");
	}
}
class OnlineBanking extends Banking
{
	public void doTransaction()
	{
		System.out.println("Trnasaction done online");
		//super.doTransaction();//here we call parent class method from overridden method 
	}
	public void display()
	{
		System.out.println("Displayed Passbook");
		super.doTransaction();//here we can call parent class method in normal method of child class
	}
}



public class OverridingExample {

	public static void main(String[] args) 
	{
		OnlineBanking ob=new OnlineBanking();
		ob.doTransaction();
		ob.display();
		

	}

}