package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> ln=new ArrayList<Integer>();
      ln.add(5);
      ln.add(6);
      ln.add(7);
      ln.add(8);
      
      System.out.println(ln);
      for(int x:ln)
      {
    	  System.out.println(x);
      }
      
      Iterator i=ln.iterator() ;
      while(i.hasNext());
      {
    	  System.out.println(i.next());
      }
      
	}

}
