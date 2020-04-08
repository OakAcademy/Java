package operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		double number1 = 8.4, number2 = 4.2, result = 0.0;
		result = number1 + number2;
		System.out.println("Number1 + Number2 : "+result);
		
		result = number1 - number2;
		System.out.println("Number1 - Number2 : "+result);
		
		result = number1 * number2;
		System.out.println("Number1 * Number2 : "+result);
		
		result = number1 / number2;
		System.out.println("Number1 / Number2 : "+result);
		
		result = number1 % number2;
		System.out.println("Number1 % Number2 : "+result);

	}

}
