package boxing;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		
		Double db = 12.8; // Auto-boxing of double
		double d = db; // Auto-unboxing of Double
		System.out.println(db + " " + d);
		
		Integer in = 5; // Auto-boxing of int
		int i = in; // Auto-unboxing of Integer
		System.out.println(in + " " + i);
		
		Character ch = 'b'; // Auto-boxing of char
		char c = ch; // Auto-unboxing of Character
		System.out.println(ch + " " + c);

	}

}
