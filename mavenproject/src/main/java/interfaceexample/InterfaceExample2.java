package interfaceexample;

public class InterfaceExample2 implements InterfaceExample,InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample2 inter=new InterfaceExample2();
		inter.method1();
		inter.method2();
		inter.method4();

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Sum = : "+c);
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("HELLO");
		
	}

}
