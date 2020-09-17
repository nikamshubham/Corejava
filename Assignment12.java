import java.util.Scanner;
class Assignment12{
	public static void main(String[] args){
		double da,hra,salary;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Basic Salary = ");
		int bs = sc.nextInt();
		if(bs<10000){
			hra =(double) bs*0.1;
			da = bs*0.9;
			salary = bs + da + hra;
			System.out.println("Gross Salary = "+salary);	
		}
		else if(bs>=10000){
			hra = 2000;
			da =(double)bs*0.98;
			salary = bs + da + hra;
			System.out.println("Gross Salary = "+salary);	
		}
		
	}
}