package week1day2;

public class MInMax_WithoutSort {

	public static void main(String[] args) {
		
		int[] marks = {80,45,78,56,89,0,-58,-12,-36,-83,48,5896,1542,7852,9852,9999};
		int l = marks.length;
		
		//Minimum Value
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < marks.length; i++) {
			if (min > marks[i]) {
				min = marks[i];
			}
		}
		System.out.println("The min value is " +min);
		
		//Maximum Value
				int max = Integer.MIN_VALUE;
				
				for (int i = 0; i < marks.length; i++) {
					if (max < marks[i]) {
						max = marks[i];
					}
				}
				System.out.println("The min value is " +max);

	}

}
