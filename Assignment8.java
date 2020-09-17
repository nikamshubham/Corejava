import java.util.Scanner;
class Assignment8{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal Amount : ");
		float p = sc.nextInt();
		System.out.print("Enter the rate : ");
		float r = sc.nextInt();
		System.out.print("Enter the time : ");
		float t = sc.nextInt();
		float A = p*(1+r*t);
		System.out.println("Final Amount = "+A);
	}
}