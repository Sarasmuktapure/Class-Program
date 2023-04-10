package com.Array;

public class Student {
	int id;
	String name;
	double per;
	
	Student(int id, String name, double per)
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
		Student s[]=new Student[3];
		s[0]=new Student(1,"Neha",89.56);
		s[1]=new Student(2,"Divya",77);
		s[2]=new Student(3,"Yash",67.88);
		
		//System.out.println(s[0].id+" "+s[0].name+" "+s[0].per);
		//System.out.println(s[1].id+" "+s[1].name+" "+s[1].per);
		//System.out.println(s[2].id+" "+s[2].name+" "+s[2].per);
		
		for(Student stud:s)
		{
			if(stud.id==2)
			{
				System.out.println(stud.id+" "+stud.name+" "+stud.per);
			}
		}
		
	

	}

}
