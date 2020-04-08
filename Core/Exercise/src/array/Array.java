package array;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers;
		numbers = new int[4];
		
		numbers[0]=4;
		numbers[1]=6;
		numbers[2]=-3;
		numbers[3]=-2;
				
		System.out.println("Sum : " + (numbers[0]+numbers[1]+numbers[2]+numbers[3]));
		
		int[] number = {4,6,-3,-2};
		number[1] = 12;
		System.out.println("------------");
		System.out.println("New Sum : " + (number[0]+number[1]+number[2]+number[3]));
		

	}

}
