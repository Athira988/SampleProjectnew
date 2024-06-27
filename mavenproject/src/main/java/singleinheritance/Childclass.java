package singleinheritance;

public class Childclass extends ParentClass {

	public void display()
	{
		System.out.println("Sample Childclass");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass cld=new Childclass();
		cld.sum();
		cld.display();

	}

}
