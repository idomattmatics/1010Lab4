import java.util.Scanner;


public class replacehate {
	
 /***Purpose: Replace a word in a line using substring method
	*Matthew Kachar
	*matthew.kachar@marquette.edu
	*February 6, 2014
	*/
	public static void main (String[]args){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter line of text:");
		
		String s = keyboard.nextLine();
		int a = s.length();
		int b = s.indexOf("hate");
		
		String a1 = s.substring(0,b);
		String a2 = "love";
		String a3 = s.substring(b+4, a);
		
		
		System.out.println("I have rephrased that line to read:");
	
		System.out.println(a1 + a2 + a3);
		
		
		
		
		
		
	}

}
