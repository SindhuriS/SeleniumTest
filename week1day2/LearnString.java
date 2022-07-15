package week1day2;

public class LearnString {

	public static void main(String[] args) {
		
		/*Two ways to create a string.
		 1. As a String Literal 2. As a String Object*/
		/*   length() = to find how many characters, returns integer
		 *   toCharArray() = to convert string to character Array, returns char[]
		 *   equals() = for content comparison, returns boolean (true/false) - CHECKS EXACT CASE SENSITIVITY
		 *   contains("") = to compare the string with matching content, returns boolean (true/false) - CHECKS EXACT CASE SENSITIVITY
		 *   index(c) = will return the index of given character, returns integer
		 *   charAt(i) = character available at the index, returns character
		 */
		 
		 String companyName = "TestLeaf";
		
		// String Object
		String company = new String("TestLeaf");
		
		int length = companyName.length();// length() is a method
		System.out.println("The length of the string is "+length);
		
		char[] chars = companyName.toCharArray();
		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
			
		}
		
		boolean isMatches = companyName.equals(company);
		System.out.println(isMatches);
		boolean contains = companyName.contains("Test");
		System.out.println("Does it has Test Word: " +contains);
		
		char third = companyName.charAt(2);// If asked, charAt(10), we will get String Index Out Of Bound Exception
		System.out.println(third);
		
		int indexOf = companyName.indexOf('T');
				System.out.println(indexOf);// provides the index of first match of 'T'
				
				int indexOf1 = companyName.indexOf('t');
				System.out.println(indexOf1);
				
				int indexOf2 = companyName.indexOf('w');
				System.out.println(indexOf2);// if character is not present, returns -1
				
				

	}

}
