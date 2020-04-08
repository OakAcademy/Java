package branching;

public class ContinueStatement {

	public static void main(String[] args) {
		
		/*int k = 50;
		if (k == 50)
			continue;
		System.out.println("Hello!");*/
		
		
		for (int i = 0; i < 10 ; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
