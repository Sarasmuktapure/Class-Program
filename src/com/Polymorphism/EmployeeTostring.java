package com.Polymorphism;

class Department2
{
	int did;
	String dname;
	
	Department2(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	public String toString()
	{
		return did+" "+dname;
	}
}


public class EmployeeTostring
{
	int id;
	String name;
	int salary;
	Department2 dept;
	
	EmployeeTostring(int id, String name, int salary, Department2 dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept;
	}

	public static void main(String[] args) 
	{
		//Department2 d2=new Department2(2,"Finance");
		//EmployeeTostring ets=new EmployeeTostring(10,"Aditya",50000,d2);
		
		EmployeeTostring ets=new EmployeeTostring(10,"Aditya",50000,new Department2(2,"Finance"));
		
		
		System.out.println(ets);

	}

}

