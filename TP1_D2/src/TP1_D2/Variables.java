package TP1_D2;

public class Variables {
	
	public static int myNumber;
	public static char movieRating;
	public static boolean isFun;
	
	public static void main(String[] args) {
		myNumber = 7;
		movieRating = 'A';
		isFun = true;
		
		System.out.println("Le film " + myNumber + " a la valeur " + movieRating + " comme Rating et à la question si c'est drôle, la reponse est : " + isFun);
	}
}
