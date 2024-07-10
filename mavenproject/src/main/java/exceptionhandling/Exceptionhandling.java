package exceptionhandling;

public class Exceptionhandling {

	int a=10;
	public void sample()
	{
		try {
		int c=a/0;
		System.out.println(c);
		}
	/*	catch (ArithmeticException a)
		
		{
			System.out.println("Exception handling done" + a); 
		} */
		finally {
			System.out.println("exception handling success");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionhandling e=new Exceptionhandling();
		e.sample();
		
	}

}
