package diego.benson;
import java.util.Scanner;
/*
 * Diego Benson
 * 9/18
 */
public class FtoC {

	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Put in Fahrenheit");
		
		fahrenheit = input.nextDouble();
		celsius = (fahrenheit-32)/1.8;
		System.out.println("Celsius = "+celsius);
		

	}

}
