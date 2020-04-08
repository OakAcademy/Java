package nestedclass;

public class InnerClassExample {
	
	static int a = 5;
	private static int b = 10;
	int c = 15;
	
	class InnerClass {
		void show () {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c); // we can access to non-static variable
		}
	}

}
