import java.util.Scanner;
class Assignment7{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of C++ : ");
		int m1 = sc.nextInt();	
		System.out.print("Enter marks of DS : ");
		int m2 = sc.nextInt();
		System.out.print("Enter marks of DBT : ");
		int m3 = sc.nextInt();
		System.out.print("Enter marks of AWP : ");
		int m4 = sc.nextInt();
		System.out.print("Enter marks of MEAN : ");
		int m5 = sc.nextInt();
		int sum = m1+m2+m3+m4+m5;
		float percentage = (sum*100)/300;
		System.out.print("Percentage = "+percentage);
	}
}