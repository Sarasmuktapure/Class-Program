package com.Polymorphism;


class Department 

{
	int did;
	String dname;
	
	Department(int did, String dname)
	{
		this.did=did;
		this.dname=dname;
	}
	
	void deptShow() 
	{
		System.out.println(did+" "+dname);
	}
	
}


public class Employee 
{
	int id;
	String name;
	int salary;
	Department dept;
	
	Employee(int id, String name, int salary, Department dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	void displayEmp()
	{
		System.out.println(id+" "+name+" "+salary+" ");
		dept.deptShow();
	}

	public static void main(String[] args) 
	{
		Department d=new Department(1,"HR");
		Employee emp=new Employee(101,"Neha",78000,d);
		//System.out.println(emp);
		emp.displayEmp();
		
	

	}

}

