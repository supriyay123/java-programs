import java.util.Scanner;

public class Sample {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Hi");
		extracted();
		numberOfDigitsCode();
		
	
	}

	

	private static void extracted() {
		System.out.println("Enter a number to check whether it's prime or not:");
		int a=sc.nextInt();
		int counter=0;
		if(a%2==0) {
			System.out.println("This is not a prime number");
		}else{
			for(int i=2;i<=a;i++) {
				if(a%i==0) {
					counter++;
				}
			}
			if(counter==0) {
				System.out.println("This is prime number");
			}
		}
	}

	private static void numberOfDigitsCode() {
		System.out.println("Enter number to find the number of digits:");
		int number = sc.nextInt();
		int numberOfDigits=0;
		
		while(number > 0) {
			number=number/10;
			numberOfDigits++;
		}
		System.out.println("No of digits is "+numberOfDigits);
		for(int i=0;i<numberOfDigits;i++) {
			System.out.println("Good Morning");
			
		}
	}

	

	
	

	

}
