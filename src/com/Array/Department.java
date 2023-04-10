package com.Array;

import java.util.Scanner;

class Employee
{
        int eid;
		String ename;
		int salary;
		
		Employee(int eid, String ename,int salary)
		{
			this.eid=eid;
			this.ename=ename;
			this.salary=salary;
		}
		public String toString()
		{
			return eid+" "+ename+" "+salary;
		}
		
	}

public class Department {
	int did;
	String dname;
	Employee e;
	
	Department(int did,String dname,Employee e)
	{
		this.did=did;
		this.dname=dname;
		this.e=e;
	}
	
	public String toString()
	{
		return did+" "+dname+" "+e;
	}
	

	public static void main(String[] args)
	{
		Department []dept=new Department[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<dept.length;i++)
		{
			System.out.println("Enter dept id");
			int did=sc.nextInt();
			System.out.println("Enter the dept name");
			String dname=sc.next();
			
			System.out.println("Enter the data for employee");
			
			System.out.println("Enter the emp id");
			int eid=sc.nextInt();
			System.out.println("Enter the emp name");
			String ename=sc.next();
			System.out.println("Enter the salary");
			int sal=sc.nextInt();
			
			
			
			
			Employee e=new Employee(eid,ename,sal);
			dept[i]=new Department(did,dname,e);
			
			//dept[i]=new Department(did,dname,new Employee(eid,ename,sal));
		
		}		//System.out.println("------------------------------------");
			
			
			for(int i=0;i<dept.length;i++)
			{
			  System.out.println(dept[i]);
			}
		
			  System.out.println("--------------------------------");
		 
		for(Department d:dept)
		{
			
			System.out.println(d);
			
		}
		
	}

}
