import java.util.Scanner;
public class tileCost {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Input the cost of tiles per square meter:");
	double cost = keyboard.nextDouble();
	System.out.println("Enter width of room:");
	int w = keyboard.nextInt();
	System.out.println("Enter height of room now:");
	int  h = keyboard.nextInt();
	System.out.println("The total cost for the room would be: $"+(w*h*cost));

	}

}
