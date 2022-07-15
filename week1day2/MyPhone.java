package week1day2;

public class MyPhone {

	public static void main(String[] args) {
		
		Mobile phone = new Mobile();
		//directly calling Mobile Class since it is in same package
		
		String phoneColor = phone.getPhoneColor();
		System.out.println("phoneColor");

	}

}
