package finalsample;

public class FinalSampleProgram  extends FinalMethodSample {

	final int a=10;
	
/*	public FinalSampleProgram()
	{
		a=10;
	}
*/	
	public void sum()
	{
		//a=10;
		System.out.println("hi");
	}
	
	//final method can not be override 
	/*public final  void display() 
	{
		
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalSampleProgram f=new FinalSampleProgram();
		System.out.println(f.a);
		f.sum();
		f.display(); // we can inherit the  final method
	

	}

}
