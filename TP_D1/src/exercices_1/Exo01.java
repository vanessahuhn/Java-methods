package exercices_1;

/*1. Write a Java program to print 'Hello' on screen 
and then print your name on a separate line. 
Expected Output :
Hello 
YourName YOurSurname*/


public class Exo01 {
	public static String a = "Hello\n";
	public static String b;
	public static String c;
	
	public static void helloMethod(String a, String b, String c) {
		
		System.out.println(a + b + " " + c);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		helloMethod(a, "Vanessa", "Huhn");
	}

}
