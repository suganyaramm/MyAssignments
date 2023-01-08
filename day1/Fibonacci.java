package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// to print fibonacci series
		int num1 = 0;
		int num2 = 1;
		int sum= 0;
		
		for (int i = 1; i < 15; i++) {
			System.out.println(num1);
			 sum = num1 +num2;
			num1=num2;
			num2=sum;
							}
		
	}

}
