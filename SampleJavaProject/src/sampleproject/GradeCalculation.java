package sampleproject;

public class GradeCalculation {
	
	String name;
	static int  sub1,sub2,sub3,avg;
	public GradeCalculation(String name1,int  newmark1,int newmark2,int  newmark3)
	{
		name=name1;	
		sub1=newmark1;
		sub2=newmark2;
		sub3=newmark3;
		System.out.println("Name of the student: "+name);
		System.out.println("The mark  obtained  : " +newmark1+" "+newmark2+" "+newmark3);
	}
	
		public static int    getAvrgMarks()
		{
			//int avg1=avg;
			int sum=sub1+sub2+sub3;
			int avg=  sum/3;
			return avg;
			//System.out.println("Average:"+avg);
		}

	public void getGrade()
		{
			int avg1=getAvrgMarks();
			System.out.print("The student Grade is: ");
			if(avg1>=80)
	        {
	            System.out.println("A");
	        }
	        else if(avg1>=60 && avg1<80)
	        {
	           System.out.println("B");
	        } 
	        else if(avg1>=40 && avg1<60)
	        {
	            System.out.println("C");
	        }
	        else
	        {
	            System.out.println("D");
	        }
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCalculation gd=new  GradeCalculation("Athira",100,90,80);	
		gd.getAvrgMarks();	
		int x=GradeCalculation.getAvrgMarks();
		System.out.println("Average: "+x);
		gd.getGrade();
		
		GradeCalculation gd1=new  GradeCalculation("Athira1",90,80,50);	
	    gd1.getAvrgMarks();
	    int y=GradeCalculation.getAvrgMarks();
		System.out.println("Average: "+y);
	    gd1.getGrade();
	}

}
