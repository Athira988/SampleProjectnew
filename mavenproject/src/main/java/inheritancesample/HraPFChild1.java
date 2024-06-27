package inheritancesample;

public class HraPFChild1 extends BasicdedbonusParent 
{
   double  hra,pf,totalded;
	public void hra()
	{ 
		
		double hra1=hra;
		double pf1=pf;
		//double totalded1=totalded;
		
		//HraPFChild1 bp=new HraPFChild1();
		hra1= (basic)*5/100;	
		pf1 =(basic)* 20/100;
		totalded =pf1-hra1-bonus;
		System.out.println("hra: "+hra1);
		System.out.println("pf: "+pf1);
		System.out.println("totaldeduction: "+totalded);
	}
	
	
}
