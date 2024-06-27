package multilevelinheritance;

public class MultiChild2 extends Multichild1 {
	
  public void division() {
	  int h=a/b;
	  System.out.println("division: "+h);
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild2 c=new MultiChild2();
		c.addition();
		c.multiplication();
		c.division();
	}

}
