package week1day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Krishna";
		char[] ch = s.toCharArray();
		int l = ch.length;
		for (int i = l-1; i >=0; i--) {
			
			System.out.print(ch[i]);// print() to print without white space 
		}

	}

}
