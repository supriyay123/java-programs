import java.util.Scanner;
public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please give int input");
		String nextInt = sc.next();

		System.out.println("Hai");

		byte byteValue = sc.nextByte();
		System.out.println(byteValue);
		short shortValue = sc.nextShort();
		System.out.println(shortValue);
		int intValue = sc.nextInt();
		System.out.println(intValue);
		long nextLong = sc.nextLong();
		System.out.println(nextLong);
		double nextDouble = sc.nextDouble();
		System.out.println(nextDouble);
		float f = sc.nextFloat();
		System.out.println(f);
		boolean nextBoolean = sc.nextBoolean();
		System.out.println(nextBoolean);
		char charAt = sc.next().charAt(0);
		System.out.println(charAt);

		String next = sc.next();

	}
	

}
