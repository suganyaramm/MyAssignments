package week1.day1;

public class PrimeNum {

	public static void main(String[] args) {
		int num =2;
		boolean isprime = true;
		for (int i = 2; i < num; i++) {
			
			if(num % i == 0) {
			  System.out.println( "not prime number");
			  isprime = false;
			 break;
			}
		}
		    if(isprime==true){
		      System.out.println(" Prime number");
		    }
			
	
	}	
		}

	


