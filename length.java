package code;

public class length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Hello World";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); 
	}

}
