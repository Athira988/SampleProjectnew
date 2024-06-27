package sampleprograms;

public class Thisdemo {

	int a,b;
	
	/*public void setValue(int a,int b)
	{
		this.a=a;
		this.b =b;
	} */
	
	public void display()
	{
		System.out.println("display");
	}
	
	public void show () {
		
		this.display();
		System.out.println("involking in method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisdemo td=new Thisdemo();
		//td.setValue(2, 3);
		System.out.println(td.a);
		System.out.println( td.b);
		td.show();
		
		

	}

}
