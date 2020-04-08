package operator;

public class OperatorPresedence {

	public static void main(String[] args) {
		
		int result = 5 + 2 * 4;
		System.out.println("Result : " + result);
		
		result = (5 + 2) * 4;
		System.out.println("Result : " + result);
		
		int x = 8, y = 4, z = 2, sum = 0;
		sum = x + --y + --z;
		System.out.println("Sum : " + sum);
		
		

	}

}
