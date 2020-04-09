import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter 3 sides of triangle: ");
        float a = i.nextFloat();
        float b = i.nextFloat();
        float c = i.nextFloat();
        
		if ((a+b)>c && (b+c)>a && (c+a)>b){
			float perimeter = a+b+c;
			float h = perimeter/2;
			float Area = (float) sqrt(h*(h-a)*(h-b)*(h-c));
        
			System.out.printf("Area: %.3f\n", Area);
		}
		else
			System.out.println("Sides entered can't form a triangle!!");
    }
}