package week1day2;

import java.util.Arrays;

public class FindMinMaxOfArray {

	public static void main(String[] args) {
		
		int[] marks = {80,45,78,56,89,0,-58,-12,-36,-83,48,5896,1542,7852,9852,9999};
		int l = marks.length;
		Arrays.sort(marks);
		System.out.println("The min value of marks is "+marks[0]);
		System.out.println("The second min value of marks is "+marks[1]);
		System.out.println("The max value of marks is "+marks[l-1]);
		System.out.println("The second max value of marks is "+marks[l-2]);
		

	}

}
