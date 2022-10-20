import java.util.Scanner;
public class Sample {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Demo();
		
	}
	public static void Demo() {
		int sum=0;
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		System.out.println("the sum of array is"+sum);
		
	}

}
