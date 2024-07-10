package exceptionhandling;

public class Throw {
	
	int age=10;
	public void eligileitycheck()
	{
		if (age>10)
		{
			System.out.println("eligible");
		}
		
			else 
			{
				//System.out.println("Ineligible");
				throw new ArithmeticException("not eligible");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw t=new Throw();
		t.eligileitycheck();
		
				
	}

}
