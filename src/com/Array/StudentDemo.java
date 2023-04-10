package com.Array;

import java.util.Scanner;

public class StudentDemo {
	int id;
	String name;
	double per;
	
	StudentDemo(int id, String name, double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	
	public String toString()
	{
		return id+" "+name+" "+per;
	}



	public static void main(String[] args)
	{

	    StudentDemo s[]=new StudentDemo[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the id");
			int sid=sc.nextInt();
			System.out.println("Enter name");
			String sname=sc.next();
			System.out.println("Enter per");
			double per=sc.nextDouble();
			
			s[i]=new StudentDemo(sid,sname,per);
	     }
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("/////////////////////////////");
		
		for(StudentDemo stud:s)
		{
			System.out.println(stud.id+" "+stud.name+" "+stud.per);
		}

}

}
