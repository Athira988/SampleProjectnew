package collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);		
		
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		int length=a.size();
		System.out.println(length);
		//a.get(2);
		System.out.println(a.get(2));
		//a.removeAll(a);
		//System.out.println(a);
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(9);
		b.add(4);
		
		System.out.println(b);
		b.addAll(a);
		System.out.println(b);

	}

}
