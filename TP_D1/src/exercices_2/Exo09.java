package exercices_2;

/*9. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

import java.util.Scanner;

public class Exo09 {
	
	private static int nb;
	private static int multiplicateur;
	private static Scanner user_input;

	public static void Table(int nb, int multiplicateur) {
		
		
		user_input = new Scanner(System.in);

        System.out.print("Input first number: ");
        nb = user_input.nextInt();
        
        for (multiplicateur = 1; multiplicateur <= 10; multiplicateur++) {

        int result = nb * multiplicateur;
        System.out.println(nb + " X " + multiplicateur + " = " + result);
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table(nb, multiplicateur);
		}
	}