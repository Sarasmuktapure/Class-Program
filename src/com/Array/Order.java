package com.Array;

import java.util.Scanner;

class Product
{
	int pid;
	String product_name;
	int price;
	Product(int pid,String product_name,int price)
	{
		this.pid=pid;
		this.product_name=product_name;
		this.price=price;
	}
	public String toString()
	{
		return pid+" "+product_name+" "+price;
	}
}

public class Order {
	int order_id;
	int qty;
	Product prod;
	Order(int oid,int qty,Product prod)
	{
		this.order_id=oid;
		this.qty=qty;
		this.prod=prod;
	}
	public String toString()
	{
		return order_id+" "+qty+" "+prod;
	}


	public static void main(String[] args)
	{
		Order []r=new Order[3];
		//r[0]=new Order(1,10,new Product(100,"Pen-Drive",500));
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<r.length;i++)
		{
			System.out.println("Enter order id");
			int oid=sc.nextInt();
			System.out.println("Enter the qty");
			int qty=sc.nextInt();
			System.out.println("Enter the product details.........");
			System.out.println("Enter product id");
			int pid=sc.nextInt();
			System.out.println("Enter product name");
			String pname=sc.next();
			System.out.println("Enter the product price");
			int price=sc.nextInt();
			
			Order o=new Order(oid, qty, new Product(pid, pname, price));
			r[i]=o;
			
		}
		for(Order o:r)
		{
			System.out.println(o);
		}
		
		

	}

}
