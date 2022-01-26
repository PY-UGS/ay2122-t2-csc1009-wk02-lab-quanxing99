import java.util.Scanner;

public class Radius {
	
	// Constant variable PI 
	public final static double PI = 3.14159; 

	public static void main(String[] args) 
	{
		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radiusValue = input.nextDouble();
		
		// Calculate circle area from input
		double area  = radiusValue * radiusValue * PI;
		System.out.println("The area for the circle of the radius " + radiusValue + " is " + area);
		
			
	}
	
	

}
