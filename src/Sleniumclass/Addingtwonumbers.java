package Sleniumclass;

public class Addingtwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int x=10;
          int y=30;
          addtwonumbers(x,y);
          MULTIPLY(x,y);
          division(x,y);
          subtraction(x,y);
          
	}

	private static void subtraction(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("subrtaction of two numbers: "+ (x-y));
	}

	private static void division(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Division of two numbers: "+ (x/y));	
	}

	private static void MULTIPLY(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Multiplication of two numbers: "+ (x*y));	
	}

	private static void addtwonumbers(int x, int y) {
		// TODO Auto-generated method stub
	System.out.println("addition of two numbers: "+ (x+y));	
	}

}
