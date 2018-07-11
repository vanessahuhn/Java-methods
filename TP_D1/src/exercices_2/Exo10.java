package exercices_2;

/*10. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output
2.138888888888889*/

public class Exo10 {
	
	public static void printExpression(double nb1, double nb2, double nb3, double nb4) {
		
		double expression = ((nb1 * nb2 - nb2 * nb2) / (nb3 - nb4));
		System.out.println(expression);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printExpression(25.5, 3.5, 40.5, 4.5);
	}

}