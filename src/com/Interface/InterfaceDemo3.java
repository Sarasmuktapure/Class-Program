package com.Interface;

abstract class ObjectMovement
{
	int speed;
	static String direction="Forword";
	abstract public void move(int newspeed);
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public int getSpeed()
	{
		return speed;
	}
}
class Ball extends ObjectMovement implements Movable{
	//by extending one class and implementing one interface we have achieve multiple type inheritance
	public void move(int s)
	{
		speed=s;
		System.out.println("Now ball is rolling with speed "+speed+"m/min on the ground in "+ObjectMovement.direction);
	}
	public void showColor()
	{
		System.out.println("Ball is red");
	}
	@Override
	public void move() {
		System.out.println("Ball is moving up and down");
		
	}
}



public class InterfaceDemo3 
{
	public static void main(String[] args)
	{
		
		ObjectMovement om=new Ball();
		Movable m=new Ball();
		om.setSpeed(20);
		System.out.println("Speed is= "+om.getSpeed());
		om.move(30);
		m.move();
		Ball b=new Ball();
		b.showColor();
		
		
		
		
		
		
		

	}

}

