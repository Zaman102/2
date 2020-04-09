import static java.lang.Math.PI;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner i = new Scanner(System.in);
    
        System.out.println("Enter radious of the Circle: ");
        float r = i.nextFloat();
    
        float perimeter = (float) (2*PI*r);
    
        System.out.printf("Perimeter: %.3f\n", perimeter);
    }
}