package com.Oops;

public class ProductDetails {
	String productName;
	int productQuantity;
	int productPrice;
	public void acceptDetails(String n,int qty,int p)
	{
		productName=n;
		productQuantity=qty;
		productPrice=p;
	}
	
	public void display() 
	{
		System.out.println("Name of product is-"+productName);	
		System.out.println("Quantity of product is-"+productQuantity);	
        System.out.println("Price of product Rs."+productPrice);	

	}
	
	
    public static void main(String[] args) 
	{
		ProductDetails pd=new ProductDetails();
		pd.acceptDetails("Television", 1, 40000);
		pd.display();

	}
	

}
