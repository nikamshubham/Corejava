import java.util.Scanner;
class Assignment11{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("A : ");
		int a = sc.nextInt(); 
		
		System.out.print("B : ");
		int b = sc.nextInt();
		// a = 10 and b = 5
		// a = 10+5=15
		// b = 15-5 =10
		// a = 15-10=5 
		//a = a + b;
		b = a - b;	
		a = a - b;
	
		System.out.println("A = "+a);
		System.out.println("B = "+b); 		
	}
}