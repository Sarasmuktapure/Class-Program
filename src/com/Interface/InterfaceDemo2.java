package com.Interface;

interface Movable{
	void move();
	static void run()
	{
		System.out.println("Running....");
	}
	
	default void stop()
	{
		System.out.println("Stop...");
	}
}

class MyCar implements Movable{
	public void move()
	{
		System.out.println("Car is moving");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		Movable m=new MyCar();
		m.move();
		Movable.run();
		//m.stop();
		MyCar mc=new MyCar();
		mc.stop();

	}

}
