package hirarchichalinheritance;

public class Hirarchichild1 extends ParentClasshirarchi
{
	
	public void add()
	{
		int f=x+y;
		System.out.println("Hirarchi Sum: "+f);
	}

	public static void main(String[] args) {
		Hirarchichild1 h=new Hirarchichild1();
		h.add();
	}
}
