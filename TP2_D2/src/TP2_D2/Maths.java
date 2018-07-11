package TP2_D2;

public class Maths {
	
	public static int x;
	public static int y;
	public static double z;
	public static String message;
	
	public static void maths(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x = 12;
		y = 25;
		z = 12.45;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		maths ("I love maths!");
	}

}
