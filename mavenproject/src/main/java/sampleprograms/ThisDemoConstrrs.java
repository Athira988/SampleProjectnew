package sampleprograms;

public class ThisDemoConstrrs {

	public ThisDemoConstrrs()
	{
		System.out.println("default const");
	}
	
	public ThisDemoConstrrs(int a,int b)
	{
		this();
		System.out.println("para constr");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemoConstrrs ts=new ThisDemoConstrrs();
		
		

	}

}
