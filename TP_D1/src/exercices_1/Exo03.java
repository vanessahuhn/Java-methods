package exercices_1;

/*3. Write a Java program to divide two numbers and print on the screen . 
Test Data : 
50/3
Expected Output :
16.6666667*/


public class Exo03 {
	
	public static void printDiv(double nb1, double nb2) {
		
		double div = nb1 / nb2;
		System.out.println(div);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDiv(50, 3);
	}

}
