package exercices_2;

/*14. Write a Java program to input and display your password. 
Expected Output

Input your Password:                                                    
Your password was: abc@123*/

import java.util.Scanner;

public class Exo14 {
	
	private static Scanner user_input;
	private static String password;

	public static void Password(String password) {
		
		user_input = new Scanner(System.in);

        System.out.print("Input your password: ");
        password = user_input.next();

        System.out.println("Your password was: " + password);
	}

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		Password(password);
	}

}