package superkeyword;

public class Car extends Vehicle{

	int maxspeed=200;
	
	public void speed()
	{
		System.out.println(super.maxspeed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.speed();
		//c.maxspeed;
		
		

	}

}
