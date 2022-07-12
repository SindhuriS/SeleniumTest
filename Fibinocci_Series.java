package week1day1;

public class Fibinocci_Series {

	public static void main(String[] args) {

		int fn=0, sn=1, n=10, tn;

		System.out.println( fn);
		System.out.println( sn);

		for (int i = 0; i <= n; i++) {

			tn=fn+sn;
			fn=sn;
			sn=tn;

			System.out.println(tn);

		}



	}



}


