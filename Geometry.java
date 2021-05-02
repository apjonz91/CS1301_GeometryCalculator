import java.util.Scanner;
/*
 * Geometry circle that gives a user the option to calculate the Area of a circle, rectangle, or triangle
 *  
 * @author Aaron Jones 
 * @version 3/28/2021
 */
public class Geometry
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		// Displays list of calculator options with numerical assignments. 
		displayMenu();
		//prompt for user choice of calculator, input stored in a choice variable. w/input validation.
		System.out.println("Enter you choice (1-3)");
		int choice = in.nextInt(); 
		while (choice > 3 || choice < 1)
		{
			System.out.print("Invalid choice. Please enter 1-3: ");
			choice = in.nextInt();
		}
		
		/*
		 * method takes stored input and assigns it to the appropriate calculator
		 *@param user input choice
		*/
		selectOption(choice);
		System.out.println("Thanks for using the Geometry Calculator - Goodbye!");
		

	}
	
	/*
	 * Displays list of calculator options with numerical assignments.
	 * Each option represents an area calculator for circle, rectangle, or a triangle.
	 */
	public static void displayMenu ()
	{
		System.out.println("Welcome to the Geometry Calculator Application");
		System.out.println("");
		System.out.println("1. Calculate the Area of a circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
	}
	
	/*
	 * calculates area of a circle
	 */
	public static double circle ()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the circle's radius? ");
		double radius = in.nextDouble();
		double area= Math.PI * Math.pow(radius,2);
		return area;
	}
	
	/*
	 * calculates area of a rectangle
	 */
	public static double rectangle ()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the rectangle's length? ");
		double length = in.nextDouble();
		System.out.print("What is the rectangle's width? ");
		double width = in.nextDouble();
		double area= width * length;
		return area;
	}
	
	/*
	 * calculates area of a triangle
	 */
	public static double triangle ()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is the length of the triangle's base? ");
		double base = in.nextDouble();
		System.out.print("What is the triangle's height? ");
		double height = in.nextDouble();
		double area= (height * base) / 2.0;
		return area; 
	}
	
	/*
	 * prints string input + value of calculated area
	 * @param returned are from area calculator
	 */
	
	public static void printArea(double area)
	{
		System.out.printf("The area is %.2f\n", area);
	}
	
	/*
	 *chooses calculator based on user input
	 *@param user inputed choice 
	 */
	public static void selectOption(int choice)
	{
		if (choice == 1)
		{
			printArea(circle());
		}
		else if (choice == 2)
		{
			printArea(rectangle());
		}
		else
		{
			printArea(triangle());
		}
	}

}
