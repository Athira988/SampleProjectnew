package hirarchichalinheritance;

public class Hirarchichild2   extends ParentClasshirarchi
{
	public void division()
	{
		int u=y/x;
		System.out.println("Hira div: "+u);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Hirarchichild2 hd=new Hirarchichild2();
		hd.sustraction();
		hd.division();
	//	hd.add();
		
	}

}
