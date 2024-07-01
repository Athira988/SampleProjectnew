package sampleproject;

public class StringMethods {

	public static void main(String[] args)
	{
		String a="Apple";
			a=a.concat(" fruit");
			System.out.println(a);
			
			//public char charAt(int index)  
			char s=a.charAt(2);
			 System.out.println("Charactr at the given indesx is: "+s);	 

			 //public String concat(String anotherString)  
			 a=a.concat(" yummy");
			System.out.println(a);			

			//public int compareTo(String anotherString)   
			int y=a.compareTo("appple");
			System.out.println(y);			

			//public boolean contains(CharSequence sequence)    
			boolean x=a.contains("l");
			System.out.println("Contains the given letter: "+x);			

			//public boolean endsWith(String suffix) 
			boolean z=a.endsWith("i") ;
			System.out.println("Check withr it is ending with teh letter : "+z);
            
			//publicboolean equals(Object anotherObject)  
			boolean v=a.equals("applle");
			System.out.println("Check whthr both are equal: "+v);

		}

	}

