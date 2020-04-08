package decisionmaking;

import java.util.Scanner;

public class IfLadderNestedIfStatement {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.print("Please enter 3 numbers : ");
		int number1, number2, number3, largestNumber;
		number1 = number.nextInt();
		number2 = number.nextInt();
		number3 = number.nextInt();
		
		if (number1 >= number2) {
			if (number1 >= number3) {
				largestNumber = number1;
			}
			else {
				largestNumber = number3;
			}
		}
		else {
			if (number2 >= number3) {
				largestNumber = number2;
			}
			else {
				largestNumber = number3;
			}
		}
		System.out.println("Largest Number : " + largestNumber);
		number.close();
		
		
		/*Scanner age = new Scanner(System.in);
		System.out.print("Please enter your age : ");
		int yourAge = age.nextInt();
		
		if(yourAge < 13) {
			System.out.println("You are a child");
		}
		else if (yourAge < 19) {
			System.out.println("You are a teenager");
		}
		else {
			if (yourAge < 65) {
				System.out.println("You are an adult");
			}
			else {
				System.out.println("You are a senior");
			}
		}*/
			

	}

}
