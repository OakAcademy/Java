package string;

public class StringMethod {

	public static void main(String[] args) {
		
		String s1 = "Java Programming Language";
		String s2 = " Hello";
		String s3[];
		
		System.out.println("String : " + s1);
		System.out.println("The first character : " + s1.charAt(0));
		System.out.println("Length of string : " + s1.length());
		System.out.println("Substring : " + s1.substring(5));
		System.out.println("Is equal : " + s1.equals(s2));
		System.out.println("Is empty : " + s1.isEmpty());
		System.out.println("Concat : " + s1.concat(s2));
		System.out.println("Uppercase : " + s1.toUpperCase());
		System.out.println("Lowercase : " + s1.toLowerCase());
		// split() method
		s3 = s1.split(" ");
		for (String string : s3) {
			System.out.print(string);
		}
		// replace() method
		System.out.println("\nReplace v, V : " + s1.replace('v', 'V'));

	}

}
