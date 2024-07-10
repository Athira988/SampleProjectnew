package abstraction;

public abstract class AbastractionSample {
	
	public AbastractionSample()
	{
		System.out.println("Absraction sample progream");
	}

	public abstract void display();//abstract class dec
	
	public abstract void method(int a,int b);
	
	public static  void  staticmethod()
	{
		System.out.println("static method");
	}
	public void instancemethod()
	{
		System.out.println("instance method");
	}
}
