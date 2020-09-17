import java.util.Scanner;
class Assignment10{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter temperature in fahrenheit : ");
		int f = s.nextInt();
		float C= (float)5*(f-32)/9 ;
		System.out.println("Temperature in celcius : "+C);
	}
}