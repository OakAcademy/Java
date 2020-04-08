package string;

public class StringExample {

	public static void main(String[] args) {
		
		String s = "Java Programming";
		String s1 = "Java Programming";
		
		String sobj = new String ("Java Programming");
		String sobj1 = new String ("Java Programming");
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(sobj);
		System.out.println(sobj1);
		
		/*
		 * '==' operator matches the references
		 * equals() method matches values or contents
		 */
		System.out.println("s == s1 : " + (s == s1));
		System.out.println("s == sobj : " + (s == sobj));
		System.out.println("s.equals(s1) : " + (s.equals(s1)));
		System.out.println("s.equals(sobj) : " + (s.equals(sobj)));
		System.out.println("sobj == sobj1 : " + (sobj == sobj1));
		System.out.println("sobj.equals(sobj1) : " + (sobj.equals(sobj1)));
		

	}

}
