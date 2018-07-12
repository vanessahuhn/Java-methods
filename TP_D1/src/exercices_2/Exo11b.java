package exercices_2;

/*11. Write a Java program to compute a specified formula. 
Specified Formula : 
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) 
Expected Output
2.9760461760461765*/

import java.util.ArrayList;

public class Exo11b {
	
	public static ArrayList<Integer> array1;
	
	private static int nb;
	private static int end;

	public static ArrayList<Integer> CreateArray(int nb, int end) {
		
		array1 = new ArrayList<Integer> ();
		
		while (nb <= 11) {

    	  if (nb % 2 == 1) {
    		  array1.add(nb);
    		  nb++;
    	  }
    	  else {
    		  nb++;
    	  }
    	      	  
		}
		System.out.println(array1);
		return array1;
	}
	
	public static void Formula(double nb1, double nb2) {

		ArrayList<Integer> array1 =  CreateArray(nb, end);
		
		double formula = nb1 * (array1.get(0) - (nb2/array1.get(1)) + (nb2/array1.get(2)) - (nb2/array1.get(3)) + (nb2/array1.get(4)) - (nb2/array1.get(5)));
		System.out.println(formula);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CreateArray(nb, end);
		Formula (4.0, 1.0);
	}

}