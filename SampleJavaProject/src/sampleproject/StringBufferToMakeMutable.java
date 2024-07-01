package sampleproject;

public class StringBufferToMakeMutable {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Animal");
		System.out.println("The word is : "+sb);		

	    sb.append("cat");
		System.out.println("Concatenated word is: "+sb);		

		sb.insert(6, " is ");
		System.out.println("After insert:" +sb);		

		sb.replace(0, 6, "pet");//replace whole word Animal with pet
		System.out.println("After replace: "+ sb);		

		sb.reverse();	
		System.out.println("After reverse: "+sb);		

		sb.capacity();

		System.out.println("Capacity:"+sb);
		

		sb.charAt(3);
		System.out.println("Char At: "+sb);



	}







}