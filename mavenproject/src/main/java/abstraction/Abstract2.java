package abstraction;

public class Abstract2 extends AbastractionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2 ab=new Abstract2();
		ab.display();
		AbastractionSample.staticmethod();//static method 
		ab.instancemethod(); //instance method
		ab.method(2, 3);

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("abstract method");
	}

	@Override
	public void method(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("sum= :"+c);
		
	}

}
