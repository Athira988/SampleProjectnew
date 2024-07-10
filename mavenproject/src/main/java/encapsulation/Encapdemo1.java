package encapsulation;

public class Encapdemo1 {
	
	private int pin1,pin2,pin3;
	
	public void setter(int pin1,int pin2,int pin3)
	{
		this.pin1=pin1;
		this.pin2=pin2;
		this.pin3=pin3;
	}

	public void  getter()
	{
		System.out.println("Valid Pin numbers are :");
		System.out.println(pin1);
		System.out.println(pin2);
		System.out.println(pin3);
	}
}
