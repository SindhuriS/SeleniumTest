package week1day1;

public class Factorial {

	public static void main(String[] args) {

		int i, f=1, n=4;

		for (i=1; i<=n; i++) {

			f= f*i;

		}
		System.out.println("Factorial of " + n + " is " + f);
	}

}
