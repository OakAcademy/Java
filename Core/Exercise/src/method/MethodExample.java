package method;

import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter 2 numbers : ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		show(number1,number2); // void method calling
		int a = add (number1,number2); // int method calling
		int b = min (number1,number2); // int method calling
		System.out.println("Sum of numbers : " + a);
		System.out.println("Minimum number : "+ b);
		

	}
	
	// displays numbers.
	public static void show (int num1, int num2) {
		System.out.println("You entered : " + num1 + " and "+num2);
	}
	
	// returns the sum of two numbers.
	public static int add (int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}
	
	// returns the minimum of two numbers.
	public static int min (int num1, int num2) {
		int min;
		if (num1 > num2)
			min = num2;
		else
			min = num1;
		return min;
	}

}
