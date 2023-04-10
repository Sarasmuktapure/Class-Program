package com.Array;

import java.util.Scanner;

public class StudentScan {
	int id;
	String name;
	double per;
	
	StudentScan(int id, String name, double per)
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
		StudentScan s[]=new StudentScan[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter the id");
			int sid=sc.nextInt();
			System.out.println("Enter name");
			String sname=sc.next();
			System.out.println("Enter per");
			double per=sc.nextDouble();
			
			s[i]=new StudentScan(sid,sname,per);
				
	    }
		
		for(StudentScan stds:s)
		{
			System.out.println(stds.id+" "+stds.name+" "+stds.per);
		}
		
		
		

	}


}
