package sampleprograms;

public class Thiskeyword {

	int a,b;
	
	public Thiskeyword()
	{
		System.out.println("default const");
	}
	
	public Thiskeyword(int a,int b)
	{
		this();
		
		this.a=a;
		this.b=b;
		this.print();		
		
	}	
	public void print()
	{
		System.out.println(a);
		System.out.println(b);
		//
		this.sum();
	}
	
	public void sum()
	{
		int c=a+b;
		System.out.println("sum:"+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword ts=new Thiskeyword(2,3);
		//ts.print();

		
	}

}
