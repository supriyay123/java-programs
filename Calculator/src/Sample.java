import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double first=num.nextDouble();
		double second=num.nextDouble();
		System.out.println("Enter an opetaror(+,-,*,/,%):");
		char operator=num.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;
		case '*':
			result=first*second;
			break;
		case '/':
			result=first/second;
			break;
		case '%':
			result=first/second;
			break;
		default:
			System.out.println("Error! operator is not correct");
		return;
		}
		System.out.println(result);
	}
}
