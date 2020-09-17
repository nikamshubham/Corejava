import java.util.Scanner;
class Assignment6{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Radius of Circle : ");
		int radius = s.nextInt();
		float pi = 3.1415f;
		double area = pi * radius * radius;
		System.out.println("Area = "+area);
		float Circumference = 2*pi*radius;
		System.out.println("Circumference = "+Circumference);	
	}
}