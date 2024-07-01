package aggregation;

public class StdentAddresschild {

	int houseno;
	Stdntdetailsparent sd;
	
	public StdentAddresschild(int houseno,Stdntdetailsparent sd )
	{
		this.houseno=houseno;
		this.sd=sd;
	}
	
	public void Printdetails()
	{
		
		System.out.println("Name: "+sd.name);
		System.out.println("Roll no: "+sd.roll);
		System.out.println("House#: "+houseno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stdntdetailsparent st1=new Stdntdetailsparent("Athira",1);
		StdentAddresschild st2=new StdentAddresschild(2,st1);
		st2.Printdetails();

	}

}
