package week1day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		//int[] scores = new int[5];
		
		int[] scores = {84, 78, 89, 84, 98, 84, 84, 99, 100, 95};
		
		int length = scores.length;
		
		// Here length is a property or a variable. 
		//It is not a method. method will have braces for it ex: sort()
		
		System.out.println("The count is: " + length);

		//read the 1st value

		System.out.println("The first score is: " + scores[0]);

		//read the last value

		System.out.println("The first score is: " + scores[length-1]);

		//goal to find how many 84's are there
		// if we use "break" inside loop, we can find first match alone

		int num=84, count=0;
		
		Arrays.sort(scores);// to sort an array where Arrays is a Class and Sort is a method, 
		//specifically in ascending order

		for (int i = 0; i < scores.length; i++) {
			
			System.out.println(scores[i]);

			if(scores[i] == num) {

				count++;
			}

		}

		System.out.println("The number of Occurances are " +count);
	}

}
