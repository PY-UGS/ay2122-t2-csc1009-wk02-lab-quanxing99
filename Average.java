import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		// Declare variable
		double[] userInput = new double[3];
		double sumValue = 0.0;
		int count = 0;


		// Take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");

		
		while(count < 3) 
		{
			double tempValue = input.nextDouble();
			userInput[count] = tempValue;
			sumValue += tempValue;
			count++;
			
		}

		double result = sumValue / 3;

		System.out.println(String.format("The average of %.1f %.1f %.1f is %.1f", userInput[0], userInput[1], userInput[2], result));

	}

}
