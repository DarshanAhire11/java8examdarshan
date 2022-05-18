class Car
{
	private int year;
	private String make;
	private double speed;
	Car(int y, String m, double bs)
	{
		this.year = y;
		this.make = m;
		this.speed = bs;
	}
	void getYear()
	{
		System.out.println("Car's year is: "+this.year);
	}
	void getMake()
	{
		System.out.println("Car's make is: "+this.make);
	}
	void getSpeed()
	{
		System.out.println("Car's speed is: "+this.speed);
	}
	void accelerate()
	{
		this.speed += 13;
		System.out.println("After accelerate : ");
	}
}
class RaceTrack
{
	public static void main(String[] args)
	{
		Car c1 = new Car(2010, "Porche", 25.0);
		c1.getYear();
		c1.getMake();
		c1.getSpeed();
		c1.accelerate();
		c1.getSpeed();
	}
}