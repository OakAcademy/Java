package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Apple");
			System.out.println("2. Banana");
			System.out.println("3. Orange");
			System.out.println("4. Exit");
			System.out.print("Select an option : ");
			choice = input.nextInt();
			switch (choice) {
				case 1 :
					System.out.println("Apple");
					break;
				case 2 :
					System.out.println("Banana");
					break;
				case 3 :
					System.out.println("Orange");
					break;
			}
			
		} while (choice != 4);
		
		
		/*int number = 1;
		do {
			System.out.print(number + " ");
			number++;
		} while (number <= 15);*/

	}

}
