package inheritancesample;

import java.util.*;
public class BasicdedbonusParent {

	double basic,bonus,ded;
	String name;
	public void details()
	{
	   // double basic1=basic;
	   // double bonus1=bonus;
	    //double ded1=ded;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		sc.next().charAt(0);
		System.out.println("Enter Basic pay: ");
		basic=sc.nextDouble();
		System.out.println("Enter deductible : ");
		ded=sc.nextDouble();
		System.out.println("Enter Bonus: ");
		bonus=sc.nextDouble();

	}

}
