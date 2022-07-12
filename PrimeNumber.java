package week1day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean prime = true;
	
		
		for (int i = 2; i <= n; i++) {
			
			if(n%i == 0) {
			
				System.out.println("This is not a prime number");
				prime = false;
				break;
			}
		}
			
			if (prime) {
				System.out.println("This is a prime number");
			}
			}
		}

	

