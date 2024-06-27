package accessmodifiers;

public class AccessModifiers1 {
	
	public void display()
	{
		System.out.println("Public method");
	}

	private void display1()
	{
	System.out.println("Private method");
	}
	protected void display2()
	{
		System.out.println("Protected method");
	}
	
	void display3()
	{
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers1 ac=new AccessModifiers1();
		ac.display();
		ac.display1();
		ac.display2();
		ac.display3();


	}

}
