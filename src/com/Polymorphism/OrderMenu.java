package com.Polymorphism;

class Order
{
	int id;
	int quantity;
	
	Order(int id,  int quantity)
	{
		this.id=id;
		this.quantity=quantity;
	}
	
	void orderDetails() 
	{
		System.out.println("order id is:"+id+" quantity is: "+quantity);
	}
	
}

public class OrderMenu {
	
	int id;
	String item;
	int price;
	Order ordr;
	
	OrderMenu(int id, String item, int price, Order ordr)
	{
		this.id=id;
		this.item=item;
		this.price=price;
		this.ordr=ordr;
	}
	
	void displayOrderMenu()
	{
		System.out.println("menu id is:"+id+ " menu item is:"+item+ " price Rs."+price+" ");
		ordr.orderDetails();
	}


	public static void main(String[] args) 
	{
		Order o=new Order(4,2);
		OrderMenu om=new OrderMenu(12,"VadaPav",30,o);
		
		om.displayOrderMenu();

	}

}

