package exercices_2;

/*11. Write a Java program to compute a specified formula. 
Specified Formula : 
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) 
Expected Output
2.9760461760461765*/

public class Exo11 {
	
	public static void Formula(double nb1, int nb2, double nb3, int nb4, int nb5, int nb6, int nb7, int nb8) {
		
		double formula = nb1 * (nb2 - (nb3/nb4) + (nb3/nb5) - (nb3/nb6) + (nb3/nb7) - (nb3/nb8));
		System.out.println(formula);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula(4.0, 1, 1.0, 3, 5, 7, 9, 11);
	}

}