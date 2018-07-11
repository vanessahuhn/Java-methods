package exercices_2;

/*8.Write a Java program to calculate the remainder of division of two numbers and print the results.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 mod 24 = 5*/

import java.util.Scanner;

public class Exo08 {
	
	private static int nb1;
	private static int nb2;
	private static Scanner user_input;

	public static void Mod(int nb1, int nb2) {
		
		user_input = new Scanner(System.in);

        System.out.print("Input first number: ");
        nb1 = user_input.nextInt();

        System.out.print("Input second number: ");
        nb2 = user_input.nextInt();

        int result = nb1 % nb2;
        System.out.println(nb1 + " % " + nb2 + " = " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mod(nb1, nb2);
	}

}

/*public class Exo8{

public static void Mod(int nb1, int nb2) {
	
	int result = nb1%nb2;
    System.out.println(nb1 + " % " + nb2 + " = " + result);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Mod(125, 24);
}

}*/