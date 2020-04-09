import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Main{
    public static void main(String []args){
        Scanner i = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        float n = i.nextFloat();
        
        int num = (int) sqrt(n);
        
        System.out.println("The near square root full number: " + num);
    }
    
}