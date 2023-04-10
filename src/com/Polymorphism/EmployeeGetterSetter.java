package com.Polymorphism;

class Department1

{
	private int did;
	private String dname;
	
	public void setId(int did)
	{
		this.did=did;
	}
	public void setName(String dname)
	{
		this.dname=dname;
	}
	public int getId()
	{
		return did;
	}
	public String getName()
	{
		return dname;
	}
	
	
	
}

public class EmployeeGetterSetter {
	private int id;
	private String name;
	private int salary;
	private Department1 dept;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void  setDepart(Department1 dept)
	{
		this.dept=dept;
	}
	public Department1 getDepart()
	{
		return dept;
	}
	
	
	
	public static void main(String[] args) 
	{
		EmployeeGetterSetter esg=new EmployeeGetterSetter();
		esg.setId(2);
		esg.setName("Aditya");
		esg.setSalary(20000);
		esg.setDepart(new Department1());
		
		esg.getDepart().setId(12);
		esg.getDepart().setName("Electronics");
		
		System.out.println(esg.getId()+" "+esg.getName()+" "+esg.getSalary()+" "+esg.getDepart().getId()+" "+esg.getDepart().getName());
		

	}

}

