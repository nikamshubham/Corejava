import java.util.Scanner;
class Assignment9{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number of days : ");
		int d = sc.nextInt(); 
		int year = d / 365;
		System.out.println("Year = "+year);
		float rem = d % 365;
		int months = (int)rem/30;
		System.out.println("months = "+months);
		int days = (int)rem%30;
		System.out.println("Days = "+days);		
	}
}