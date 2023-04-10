package com.Encapsulation;

class HotelInfo
{
	private int id;
	private String name;
	private String location;
	private double rating;
	private String seatingCapacity;
	private String paymentType;
	private boolean isOnlineorderAvailable;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setLocation(String location)
	{
		this.location=location;
	}
	public String getLocation()
	{
		return location;
	}
	
	public void setRating(double rating)
	{
		this.rating=rating;
	}
	public double getRating()
	{
		return rating;
	}
	
	public void setSeatingCapacity(String seatingCapacity)
	{
		this.seatingCapacity=seatingCapacity;
	}
	public String getSeatingCapacity()
	{
		return seatingCapacity;
	}
	
	public void setPaymentType(String paymentType)
	{
		this.paymentType=paymentType;
	}
	public String getPaymentType()
	{
		return paymentType;
	}
	
	public void setIsOnlineorderAvailable(boolean isOnlineorderAvailable )
	{
		this.isOnlineorderAvailable=isOnlineorderAvailable;
	}
	public boolean getIsOnlineorderAvailable()
	{
		return true;
	}
	

}

public class Hotel {
	public static void main(String[] args)
	{
		HotelInfo hi=new HotelInfo();
		hi.setId(123);
		hi.setName("Taj Hotel");
		hi.setLocation("Mumbai");
		hi.setRating(5d);
		hi.setSeatingCapacity("More than 100 persons");
		hi.setPaymentType("Online or Cash");
		hi.setIsOnlineorderAvailable(true);
		
		System.out.println(hi.getId()+" "+hi.getName()+" "+hi.getLocation()+" "+hi.getRating()+" "+hi.getSeatingCapacity()+" "+hi.getPaymentType()+" "+hi.getIsOnlineorderAvailable());
		

	   }

	

}
