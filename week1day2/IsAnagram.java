package week1day2;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		/*
		 * String s1 = "hello"
		 * String s2 = "loleh"
		 * 
		 * Here S1, S2 are Anagrams
		 * 
		 * For String comparison, always start converting into character Array
		 * 
		 */
		
		String s1 = "hello";
		String s2 = "loleh";
		boolean bAnagram = true;
		 char[] ch1 = s1.toCharArray();
		 char[] ch2 = s2.toCharArray();
		 
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 for (int i = 0; i < ch2.length; i++) {
			 if (ch1[i]==ch2[i]) {
				 System.out.println("Not Anagram");
				 bAnagram = false;
				 break;	
			}			
		}
		 if(bAnagram) {
			 System.out.println("Is Anagram");
		 }
			 
	}

}
