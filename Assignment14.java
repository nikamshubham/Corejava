import java.util.Scanner;
class Assignment14{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter an year..");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
     		    	System.out.println(year +" year is a leap year");
     		else
         			System.out.println(year +" year is not a leap year");
   		/*
		if(year % 4 == 0 && year%100 != 0)
			{
				System.out.println(year+" is leap year");
			}
		else if( year %400==0 )
		{
			System.out.println(year+" is not leap year");
		}
		else{
			System.out.println(year+" is not leap year");
		}*/
	
	}
}