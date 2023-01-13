package week1.day2.assignments;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		String name = "amazon";
		//char[] charArray1 = name.toCharArray();
		String upperCase2 = name.toUpperCase();
		System.out.println(upperCase2);
		char[] charArray1 = upperCase2.toCharArray();
		int length = charArray1.length;
		System.out.println(length);
		for (int i = 0; i < charArray1.length; i++) {
			if(i%2 == 0) {
				System.out.println(charArray1[i]);
							} 
			else {
				String lowerCase = name.toLowerCase();
				char[] charArray2 = lowerCase.toCharArray();
				System.out.println(charArray2[i]);
				
			}
			
		}
		
			
		
		}
		
	}

			
		


	


