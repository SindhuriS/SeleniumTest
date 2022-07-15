package week1day2;

import java.util.Arrays;

public class FindDuplicateValue {

	public static void main(String[] args) {
		int[] scores = {52,85,68,95,52,42,42,95};
		int l=scores.length;
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] == scores[i+1]) {
				System.out.println( "Duplicate value is "+scores[i]);
			}

		}

	}

}
/*Exception will be coming because of 'for loop' since looping through scores.length => 
 * scores[8] which does not exist*/
 
