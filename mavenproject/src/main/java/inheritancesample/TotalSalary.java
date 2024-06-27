package inheritancesample;

public class TotalSalary  extends HraPFChild1 {

	double total;
	/*	 double totalded;
	
	public void total()
	{
		double total1=total;
		total1=basic+bonus-totalded;
		System.out.println("Total Salary: "+total1);
		
		//total=basic +
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary ts=new TotalSalary();
		ts.details();		
		ts.hra();
		double total=ts.basic+ts.bonus-ts.totalded;
		System.out.println("Total Salary: "+total);
		//ts.total();	

	}

}
