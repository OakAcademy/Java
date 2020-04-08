package nestedclass;

public class InnerTest {

	public static void main(String[] args) {
		
		InnerClassExample outer = new InnerClassExample();
		InnerClassExample.InnerClass inner = outer.new InnerClass();
		inner.show();

	}

}
