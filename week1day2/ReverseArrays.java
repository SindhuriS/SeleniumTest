package week1day2;

public class ReverseArrays {

	public static void main(String[] args) {
		
	 //int[] array = new int [5];
		
	 int[] scores = {80,95,85,65,85,48,78,96,99,58,68,35,82};
	 
	 int l = scores.length;
	 
	 for (int i = l-1 ; i >=0; i--) {
		 
		 System.out.println("The occurances of Array in reversed order are "+scores[i]);
		
	}
	 

	}

}
