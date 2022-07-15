package week1day2;

public class FindRepetitiveCharacterCount {

	public static void main(String[] args) {

		String S = "Krishnas";
		char c = 's';
		int count=0;
		char[] ch = S.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if(ch[i] == c) {
				count++;
			}
		}

		System.out.println(count);
	}

}
