package inputoutput;

import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		
		Scanner inputText = new Scanner(System.in);
		System.out.println("Please enter a text : ");
		
		System.out.println("You entered : "+inputText.next());
		inputText.close();

	}

}
