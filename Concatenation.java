/**
 * 
 */
package code;

/**
 * 
 */
public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
	/*WARNING!

Java uses the + operator for both addition and concatenation.
	*/
		//If you add two numbers, the result will be a number:
		int x = 10;
		int y = 20;
		int z = x + y;  // z will be 30 (an integer/number)
		System.out.println(z);
		//If you add two strings, the result will be a string concatenation:
		
		String a = "10";
		String b = "20";
		String c = a+ b;  // z will be 1020 (a String)
		System.out.println(c);
		//If you add a number and a string, the result will be a string concatenation:
		String w = "10";
		int m = 20;
		String l = w + m;  // z will be 1020 (a String)
	
		System.out.println(l);}

}
