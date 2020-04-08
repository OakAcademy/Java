package datatype;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a = 124;
		long b = a;
		double d = b;
		
		System.out.println("int value : " + a);
		System.out.println("long value : " + b);
		System.out.println("double value : " + d);
		
		double s = 86.02;
		long m = (long) s;
		byte c = (byte) m;
		
		System.out.println("---------------------");
		System.out.println("double value : " + s);
		System.out.println("long value : " + m);
		System.out.println("byte value : " + c);

	}

}
