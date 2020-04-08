package enumtype;

import java.util.Scanner;

public class ColorTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a color : ");
		String inputColor = input.next();
		try {
			Color color = Color.valueOf(inputColor.toUpperCase());
			switch (color) {
				case RED :
					System.out.println("You entered RED.");
					break;
				case YELLOW :
					System.out.println("You entered YELLOW.");
					break;
				case GREEN :
					System.out.println("You entered GREEN.");
			}
		}
		catch (IllegalArgumentException e) {
			System.out.println("Please enter enum constant type "
					+ "[RED, YELLOW, GREEN]");
		}

	}

}
