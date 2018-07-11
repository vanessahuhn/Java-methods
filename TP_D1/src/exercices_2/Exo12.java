package exercices_2;

/*12. Write a Java program that calculates 
the average of  three  predefined numbers.*/

public class Exo12 {
	
	public static void Average(double nb1, double nb2, double nb3) {
		
		double average = (nb1 + nb2 + nb3) / 3.0;
		System.out.println(average);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average(12, 2.5, 6);
	}

}
