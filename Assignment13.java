import java.util.Scanner;
class Assignment13{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		int y = sc.nextInt(); 
		int z = sc.nextInt(); 

		int big = (x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println(big+" is largest Number");

		/*if(x>y && x>z)
		{
			System.out.println(x+" is largest Number");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is largest Number");	
		}
		else
		{
			System.out.println(z+" is largest Number");
		}*/
	}
}