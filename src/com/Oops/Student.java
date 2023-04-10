package com.Oops;

public class Student {
	int roll_no;
	String name;
	int marks1,marks2,marks3;
	float per;
	
	public void acceptDetails(int id,String n)
	{
		roll_no=id;
		name=n;
		
	}
	public void calculatePercentage(int m1,int m2,int m3)
	{
		int sum=m1+m2+m3;
		System.out.println("The percentage is:"+((sum*100)/300)+" %");
		
	}
	
	public void showDetails() 
	{
		System.out.println("The roll number of student is:"+roll_no);	
		System.out.println("The name of student is:" +name);	
		
	}
	
	
	public static void main(String[] args)
	{
		Student std1=new Student();
		
		std1.acceptDetails(36, "Aditya");
		
		std1.showDetails();
		std1.calculatePercentage(60, 80, 75);

		
		
	}


}
