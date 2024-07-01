package sampleproject;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";//literal form
		String str=new String("hello");//new keyword
		System.out.println(s);
		System.out.println(str);

		//converting char to string
		char a[]= {'a','b','c'};
		String str1=new String(a);
		System.out.println(str1);
	}

}
