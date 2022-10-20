import java.util.Scanner;
public class Test {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
			
			
		voting();
		
		System.out.println("Enter 2 numbers:");
		int fnumber=sc.nextInt();
		int snumber=sc.nextInt();
		if(fnumber>snumber) {
			System.out.println(fnumber + " is greater");
		}
		else {
			System.out.println(snumber + " is greater");
					
			
		}
	}
	public static void voting() {
		System.out.println("Enter Age:");
		
		int age=sc.nextInt();
		boolean result=age>18 ? true : false;
		if(result) {
			System.out.println("Hey! Please Do Vote");
			
		}
		
		
	}
	
}
