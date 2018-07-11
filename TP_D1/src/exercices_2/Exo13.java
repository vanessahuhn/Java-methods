package exercices_2;

/*13. Write a Java program to swap two 
 variables.*/

public class Exo13 {
	
	private static int temp;

	public static void Swap(int x, int y) {
		
		System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swapping\nx = "+x+"\ny = "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap(4, 5);
	}

}