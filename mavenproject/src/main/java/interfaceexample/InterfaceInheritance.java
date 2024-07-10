package interfaceexample;

public class InterfaceInheritance  implements InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	InterfaceInheritance in=new InterfaceInheritance();
		//in.method1();
	//	in.method2();
	//	in.method4();
		
		//interfacename objectname=new classname();
		
		InterfaceExample3 ex=new InterfaceInheritance();
		ex.method1();
		ex.method2();
		ex.method4();
		
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
		System.out.println("athira");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Obsqura");
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}

}
