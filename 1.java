import java.util.Scanner
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner i = new Scanner(System.in);
		System.out.println("Enter the value of x1: ");
		double x1 = i.nextDouble();
		System.out.println("Enter the value of x2: ");
		double x2 = i.nextDouble();
		System.out.println("Enter the value of x3: ");
		double y1 = i.nextDouble();
		System.out.println("Enter the value of x4: ");
		double y2 = i.nextDouble();
		
		double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.printf("Distance between two points: %.3f\n", distance);
	}
}
