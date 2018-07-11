package exercices_1;

/*5. Write a Java program that takes two numbers as input and display the product of two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;

public class Exo05 {
	
	private static int nb1;
	private static int nb2;
	private static Scanner user_input;

	public static void Product(int nb1, int nb2) {
		
		user_input = new Scanner(System.in);

        System.out.print("Input first number: ");
        nb1 = user_input.nextInt();

        System.out.print("Input second number: ");
        nb2 = user_input.nextInt();

        int result = nb1*nb2;
        System.out.println(nb1 + " x " + nb2 + " = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product(nb1, nb2);
	}

}

/*public class Exo5 {
	
	public static void Product(int nb1, int nb2) {
		
		int result = nb1*nb2;
        System.out.println(nb1 + " x " + nb2 + " = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product(25, 5);
	}

}*/


