package loop;

public class ForLoop {

	public static void main(String[] args) {
		
		/*int i;
		for (i = 0; i<=10; i++) {
			System.out.println(i);
		}*/
		
		/*int sum = 0;
		for (int k = 0; k<=5; k++) {
			sum +=k ; // sum = sum + k
			System.out.println(k);
		}
		System.out.println("Sum of numbers : " + sum);*/
		
		int sum = 0;
		for (int k = 0; k<=10; k +=2) {
			sum +=k ; // sum = sum + k
			System.out.println(k);
		}
		System.out.println("Sum of even numbers : " + sum);
	}

}
