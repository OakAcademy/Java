package exception;

public class ThrowableMethod {

	public static double divide (double x, double y) {
		
		if (y == 0) {
			throw new ArithmeticException("ArithmeticException occured.");
		}
		return x / y;
	}
	
	public static void main(String[] args) {
		
		double d;
		try {
			d = divide (5.6,0);
		}
		catch (ArithmeticException e) {
			System.out.println("Divider can not be equal to zero.");
			// useful Throwable methods.
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		}

	}

}
