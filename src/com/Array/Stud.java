package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Stud {
	int id;
	String name;
	int marks[];
	
	Stud(int id,String name,int[]marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}
	

	public static void main(String[] args) 
	{
		Stud s[]=new Stud[3];
		
		//int m[]= {34,56,78};
		//s[0]=new Stud(101,"Amit",m);
		Scanner sc=new Scanner(System.in);
	
		for(int i=0; i<s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter marks");
			int[]m=new int[3];
			
			
			for(int j=0;j<m.length;j++)
			{
				m[j]=sc.nextInt();
			
			}
			
			s[i]=new Stud(id,name,m);
		
		}
	
       for(Stud st:s)
		{
			 System.out.println(st);
			
		}
       
       System.out.println("---------------------------------");
       
       
       for(Stud st:s)
       {
    	   int[]mk=st.marks;
    	   int sum=0;
    	   for(int i=0; i<mk.length;i++)
    	   {
    		   sum=sum+mk[i];
    	   }
    	   int per=sum/mk.length;
    	   
    	   //System.out.println(per);
    	 
    	   if(per>60)
    	   {
    		   System.out.println("Show the details whose percentage is more than 60");
    		   System.out.println(st+" per="+per);
    	   }
       }
       
		
	}


}
