package superkeyword;

public class Superkeywordsampl2 extends Superkeyword {
	
	public Superkeywordsampl2()
	{
		super();
		System.out.println("Constr");
		super.sum();
		System.out.println(super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeywordsampl2 cal1=new Superkeywordsampl2();
		//cal1.sum();
	}

}
