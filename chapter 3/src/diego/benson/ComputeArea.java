package diego.benson;

import java.util.Scanner;

/*
 * Diego Benson
 * 9/18
 * compute the area of a circle 
 */

public class ComputeArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// step one: enter the radius of a circle 
		double PI = 3.14159265359;
			
		
		
		double radius;
		double area; 
		
		//assign a value to radius
		System.out.println("enter the radius of a "
				+ "circle and press enter: ");
		radius = input.nextDouble(); 
		
		// step two: compute the area of the following formulea:
		// area = radius*radius*pi
		area = radius*radius*PI;
		
		
		// step three: display result
		
		System.out.println("the area of your circle"
				+ " is:" + area +"\"");

	}

}
