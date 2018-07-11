package exercices_1;

/*4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5+15/3*2-8%3

Expected Output :
43 
1 
19 
13*/

public class Exo04 {
	
	public static void operationA(int nb1, int nb2, int nb3) {
		
		//a. -5 + 8 * 6
		System.out.println(-nb1 + nb2 * nb3);
	
	}
	
	public static void operationB(int nb1, int nb2) {
		
		//b. (55+9) % 9
		System.out.println((nb1 + nb2) % nb2);
	
	}
	
	public static void operationC(int nb1, int nb2, int nb3, int nb4) {
		
		//c. 20 + -3*5 / 8
		System.out.println(nb1 + -nb2 * nb3 / nb4);
	
	}
	
	public static void operationD(int nb1, int nb2, int nb3, int nb4, int nb5) {
		
		//d. 5+15/3*2-8%3
		System.out.println(nb1 + nb2 / nb3 * nb4 - nb5 % nb3);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a. -5 + 8 * 6
		operationA (5, 8, 6);
		//b. (55+9) % 9
		operationB (55, 9);
		//c. 20 + -3*5 / 8
		operationC(20, 3, 5, 8);
		//d. 5+15/3*2-8%3
		operationD(5, 15, 3, 2, 8);
	}

}
