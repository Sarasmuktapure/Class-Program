package com.Polymorphism;


//containment using gettetr setter
class Address
{
	private int pincode;
	private String city;
	
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public int getPincode()
	{
		return pincode;
	}
	public String getCity()
	{
		return city;
	}
}
public class Person {
	private int id;
	private String name;
	private Address adr;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address getAdr() {
		return adr;
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.setId(1);
		p.setName("Amit");
		p.setAdr(new Address());
		
		p.getAdr().setPincode(413512);
		p.getAdr().setCity("Latur");
		System.out.println(p.getId()+" "+p.getName()+" "+p.getAdr().getCity()+" "+p.getAdr().getPincode());
				

	}

}

