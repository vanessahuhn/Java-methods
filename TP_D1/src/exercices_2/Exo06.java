package exercices_2;

/*6. Write a Java program to print the sum (addition) of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149*/

import java.util.Scanner;

public class Exo06 {
	
	private static int nb1;
	private static int nb2;
	private static Scanner user_input;

	public static void Sum(int nb1, int nb2) {
		
		user_input = new Scanner(System.in);

        System.out.print("Input first number: ");
        nb1 = user_input.nextInt();

        System.out.print("Input second number: ");
        nb2 = user_input.nextInt();

        int result = nb1 + nb2;
        System.out.println(nb1 + " + " + nb2 + " = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum(nb1, nb2);
	}

}

/*public class Exo6 {

public static void Sum(int nb1, int nb2) {
	
	int result = nb1+nb2;
    System.out.println(nb1 + " + " + nb2 + " = " + result);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Sum(125, 24);
}

}*/