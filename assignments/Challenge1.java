package week1.day2.assignments;

public class Challenge1 {

	public static void main(String[] args) {
		String s= "fly me to the moon";
		String substring = s.substring(s.lastIndexOf(" "));
		String replaceAll = substring.replaceAll(" ", "");
		int length2 = replaceAll.length();
				System.out.println(length2);		
				System.out.println(replaceAll);
																
				}
}
		
	  
		


